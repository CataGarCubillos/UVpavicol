package uvpavicol.clases;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Lote {
    //atributos propios
    private LocalDate fechaIngreso;
    //asociacion uno a uno
    private Galpon galpon;
    //asociacion uno a muchos
    private List<Salida> salidas = new LinkedList<>();
    private List<RegistroDiario> registrosDiarios = new LinkedList<>();

    public Lote(LocalDate fechaIngreso, Galpon galpon) throws Exception {
        if(fechaIngreso== null){
            throw new Exception("ERROR. todo lote debe tener regristrada su fecha de ingreso.");
        }
        if(galpon == null){
            throw new Exception("ERROR. todo lote debe tener asignado un galpon.");
        }
        this.fechaIngreso = fechaIngreso;
        this.galpon = galpon;
    }
//----------------------------------------------------------------------------
    //metodos de salida
    public void removeSalidas(Salida salida) {
        this.salidas.remove(salida);
    }

    public void addSalidas(Salida salida) {
        this.salidas.add(salida);
    }

    public List<Salida> getSalidas() {
        return salidas;
    }
    public void setSalidas(List<Salida> salidas) {
        this.salidas = salidas;
    }
//----------------------------------------------------------------------------
    //metodos Registro diario
    public void addRegistroDiario(RegistroDiario rg) {
        this.registrosDiarios.add(rg);
    }

    public void revomeRegistroDiario(RegistroDiario rg) {
        this.registrosDiarios.remove(rg);
    }

    public List<RegistroDiario> getRegistrosDiarios() {
        return registrosDiarios;
    }
    public void setRegistrosDiarios(List<RegistroDiario> registrosDiarios) {
        this.registrosDiarios = registrosDiarios;
    }
//----------------------------------------------------------------------------
    //metodos de galpon
    public Galpon getGalpon() {
        return galpon;
    }
    public void setGalpon(Galpon galpon) {
        this.galpon = galpon;
    }
//----------------------------------------------------------------------------
    //metodos de fecha
    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }
//----------------------------------------------------------------------------
    public long CantidadAvesMuertas(){
        long cantidad=0;
        for(int i=0;i<this.registrosDiarios.size();i++){
            RegistroDiario aves = this.registrosDiarios.get(i);
            cantidad = cantidad + aves.getAvesMuertas();
        }return cantidad;
    }
    public long cantidadSAcrificadas(){
        long sacrificio=0;
        for(int i=0;i<this.salidas.size();i++){
            Salida aves = this.salidas.get(i);
            sacrificio=sacrificio+aves.getAvesSacrificadas();
        }return sacrificio;
    }
    public long diferenciaAves(){
        return this.getGalpon().getCantidadAves()-(this.CantidadAvesMuertas()+this.cantidadSAcrificadas());
    }
}