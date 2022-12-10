package uvpavicol.clases;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Granja implements Serializable{
    //atributos propios
    
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column (nullable = false, length = 80)
    private String nombre;
    //asociacion uno a uno
    
    @OneToOne
    private EstadoConvenio estadoConvenio;
    
    @OneToOne
    private TipoGranja tipoGranja;
    
    @OneToOne
    private Municipio elMunicipio;
    
    @OneToOne
    private Propietario elPropietario;
    
    //asociacion uno a muchos
    @OneToMany
    private List<Galpon> losGalpones = new ArrayList<>();

    public Granja(String nombre, EstadoConvenio estadoConvenio, TipoGranja tipoGranja, Municipio elMunicipio, Propietario elPropietario) throws Exception {
        if(nombre == null || "".equals(nombre)){
            throw new Exception("Porfavor digite el nombre de la granja");
        }
        if(estadoConvenio == null){
            throw new Exception("ERROR. Todas las granjas deben tener un estado de convenio");
        }
        if(tipoGranja == null){
            throw new Exception("ERROR. Toda granja debe tener un tipo");
        }
        if(elMunicipio == null){
            throw new Exception("Se le debe especificar el municipio a todas las granjas");
        }
        if(elPropietario == null){
            throw new Exception("Se le debe especificar el propietario a todas las granjas");
        }
        this.nombre = nombre;
        this.estadoConvenio = estadoConvenio;
        this.tipoGranja = tipoGranja;
        this.elMunicipio = elMunicipio;
        this.elPropietario = elPropietario;
    }

    //metodos get
    public String getNombre() {
        return nombre;
    }
    public EstadoConvenio getEstadoConvenio() {
        return estadoConvenio;
    }
    public TipoGranja getTipoGranja() {
        return tipoGranja;
    }
    public Municipio getElMunicipio() {
        return elMunicipio;
    }
    public Propietario getElPropietario() {
        return elPropietario;
    }
    public List<Galpon> getLosGalpones() {
        return losGalpones;
    }
    //metodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEstadoConvenio(EstadoConvenio estadoConvenio) {
        this.estadoConvenio = estadoConvenio;
    }
    public void setTipoGranja(TipoGranja tipoGranja) {
        this.tipoGranja = tipoGranja;
    }
    public void setElMunicipio(Municipio elMunicipio) {
        this.elMunicipio = elMunicipio;
    }
    public void setElPropietario(Propietario elPropietario) {
        this.elPropietario = elPropietario;
    }
    public void setLosGalpones(List<Galpon> losGalpones) {
        this.losGalpones = losGalpones;
    }
//----------------------------------------------------------------------------
    //metodos add y remove
    public void addGalpones(Galpon galpones) {
        this.losGalpones.add(galpones);
    }
    public void removeGalpones(Galpon galpones) {
        this.losGalpones.remove(galpones);
    }
//----------------------------------------------------------------------------

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



}
