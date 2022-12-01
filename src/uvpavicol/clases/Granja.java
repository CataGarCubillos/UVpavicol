package uvpavicol.clases;

import java.util.LinkedList;
import java.util.List;

public class Granja {
    //atributos propios
    private String nombre;
    //asociacion uno a uno
    private EstadoConvenio estadoConvenio;
    private TipoGranja tipoGranja;
    private Municipio elMunicipio;
    private Propietario elPropietario;
    //asociacion uno a muchos
    private List<Galpon> losGalpones = new LinkedList<>();

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
}
