
package uvpavicol.clases;

import java.time.LocalDate;

public class RegistroDiario {
    //atrubutos propios
    public enum TIPOALIMENTO {
    INICIADOR, CRECIMIENTO, ENGORDE
}
    private LocalDate fecha;
    private float cantidadAlimento;
    private int avesMuertas;
    private double pesoPromedio;
    //no hay uno a uno
    //no hay uno a muchos

    public RegistroDiario(LocalDate fecha, float cantidadAlimento, int avesMuertas, double pesoPromedio) throws Exception {
        if(fecha == null){
            throw new Exception("ERROR. cada registro debe tener una fecha");
        }
        if(cantidadAlimento <0){
            throw new Exception("ERROR. La cantidad de alimentos debe ser un 0 (cero) o mayor");
        }
        if(avesMuertas <0){
            throw new Exception("ERROR. La cantidad de aves muertas debe ser un 0 (cero) o mayor");
        }
        if(pesoPromedio <0){
            throw new Exception("ERROR. El precio promedio debe ser un 0 (cero) o mayor");
        }
        this.fecha = LocalDate.now();
        this.cantidadAlimento = cantidadAlimento;
        this.avesMuertas = 0;
        this.pesoPromedio = 0;
    }

    //metods get
    public LocalDate getFecha() {
        return fecha;
    }
    public float getCantidadAlimento() {
        return cantidadAlimento;
    }
    public int getAvesMuertas() {
        return avesMuertas;
    }
    public double getPesoPromedio() {
        return pesoPromedio;
    }

    //metodos set
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public void setCantidadAlimento(float cantidadAlimento) {
        this.cantidadAlimento = cantidadAlimento;
    }
    public void setAvesMuertas(int avesMuertas) {
        this.avesMuertas = avesMuertas;
    }
    public void setPesoPromedio(double pesoPromedio) {
        this.pesoPromedio = pesoPromedio;
    }
 
}
