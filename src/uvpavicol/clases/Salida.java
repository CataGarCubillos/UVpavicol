package uvpavicol.clases;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
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
public class Salida implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //atributos propios
    @Column(nullable = false, length = 80)
    private long avesSacrificadas;
    
    @Column(nullable = false, length = 80)
    private long avesVivas;
    
    
    //Uno a muchos con la clase EstadoLote
    @OneToMany
    private List<EstadoLote> estadosLotes = new ArrayList<>();

    //Uno a uno con fecha y hora.
    @OneToOne
    private LocalDate fecha;

    @OneToOne
    private LocalTime hora;

    public Salida(long avesSacrificadas, LocalDate fecha, LocalTime hora, long avesVivas) throws Exception {
        if (avesSacrificadas < -1) {
            throw new Exception("La cantidad de aves sacrifiacadas debe ser 0 (cero) o mayor");
        }
        if (avesSacrificadas > avesVivas) {
            throw new Exception("La cantidad de aves sacrifiacadas debe ser menor a la cantidad total de aves");
        }
        if (fecha == null) {
            throw new Exception("Cada salida debe tener una fecha especifica");
        }
        if (hora == null) {
            throw new Exception("Cada salida debe tener una hora especifica.");
        }
        this.avesSacrificadas = 0;
        this.fecha = LocalDate.now();
        this.hora = LocalTime.now();
        this.avesVivas = avesVivas;
    }

    public Salida() {
    }

    public void setAvesVivas(long avesVivas) {
        this.avesVivas = avesVivas;
    }

    //----------------------------------------------------------------------------  

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    
    //metodos add y remove de Estado lote
    public void addEstadoLotes(EstadoLote estadosLotes) {
        this.estadosLotes.add(estadosLotes);
    }

    public void removeEstadoLotes(EstadoLote estadosLotes) {
        this.removeEstadoLotes(estadosLotes);
    }
//----------------------------------------------------------------------------
    //metodos get

    public List<EstadoLote> getEstadosLotes() {
        return estadosLotes;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public long getAvesSacrificadas() {
        return avesSacrificadas;
    }

    public long getAvesVivas() {
        return avesVivas;
    }

//----------------------------------------------------------------------------
    //metodos set
    public void setAvesSacrificadas(long avesSacrificadas) {
        this.avesSacrificadas = avesSacrificadas;
    }

    public void setEstadosLotes(List<EstadoLote> estadosLotes) {
        this.estadosLotes = estadosLotes;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

}
