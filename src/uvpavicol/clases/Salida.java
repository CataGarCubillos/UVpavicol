package uvpavicol.clases;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;

public class Salida {
     //atributos propios
    private long avesSacrificadas;
    
    private long avesVivas;
    //Uno a muchos con la clase EstadoLote
    private List<EstadoLote> estadosLotes = new LinkedList<>();
    //Uno a uno con fecha y hora.
    private LocalDate fecha;
    private LocalTime hora;
    
    public Salida(long avesSacrificadas, LocalDate fecha, LocalTime hora,long avesVivas) throws Exception {
        if(avesSacrificadas < -1){
            throw new Exception("La cantidad de aves sacrifiacadas debe ser 0 (cero) o mayor");
        }
        if(avesSacrificadas > avesVivas){
            throw new Exception("La cantidad de aves sacrifiacadas debe ser menor a la cantidad total de aves");
        }
        if(fecha == null){
            throw new Exception("Cada salida debe tener una fecha especifica");
        }
        if(hora == null){
            throw new Exception("Cada salida debe tener una hora especifica.");
        }
        this.avesSacrificadas = 0;
        this.fecha = LocalDate.now();
        this.hora = LocalTime.now();
        this.avesVivas=avesVivas;
    }
 //----------------------------------------------------------------------------  
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
