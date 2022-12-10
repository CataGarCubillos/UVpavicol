package uvpavicol.clases;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;



@Entity
public class Lote implements Serializable{
    //atributos propios
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, length = 80)
    private int identificador;
    
    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private LocalDate fechaIngreso;

   
    
    @Column(nullable = false, length = 80)
    private int cantidadAves;
    
    
    //asociacion uno a uno
    
    @OneToOne
    private Galpon galpon;
    
    @OneToOne
    private EstadoLote estado;
    //asociacion uno a muchos
    
    @OneToMany
    private List<Salida> salidas = new ArrayList<>();
    
    @OneToMany
    private List<RegistroDiario> registrosDiarios = new ArrayList<>();

    public Lote(LocalDate fechaIngreso, Galpon galpon, int cantidadAves, int identificador, EstadoLote estadoLote) throws Exception {
        if(fechaIngreso== null){
            throw new Exception("ERROR. todo lote debe tener regristrada su fecha de ingreso.");
        }
        if(galpon == null){
            throw new Exception("ERROR. todo lote debe tener asignado un galpon.");
        }
        if(cantidadAves <= 0){
            throw new Exception("ERROR. todo lote debe contener almenos una ave");
        }
        if(identificador <= 0){
            throw new Exception("ERROR. todo lote debe contener almenos una ave");
        }
        this.estado=estado;
        this.fechaIngreso = fechaIngreso;
        this.galpon = galpon;
        this.cantidadAves = cantidadAves;
        this.identificador=identificador;
    }

    public Lote() {
    }

    
    public int getCantidadAves() {
        return cantidadAves;
    }

    public int getIdentificador() {
        return identificador;
    }

    @Override
    public String toString() {
        return "" + "id:" + identificador + ' ';
    }

    public void setEstado(EstadoLote estado) {
        this.estado = estado;
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
        long vivas=this.getGalpon().getCantidadAves()-(this.CantidadAvesMuertas()+this.cantidadSAcrificadas());
        if(vivas <= 0){
            setEstado(EstadoLote.FINALIZADO);
        }
        return vivas;
    }
}
