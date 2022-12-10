package uvpavicol.clases;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

@Entity
public class RegistroDiario implements Serializable {

    //atrubutos propios
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private double id;

    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private LocalDate fecha;

    @Column(nullable = false, length = 80)
    private float cantidadAlimento;

    @Column(nullable = false, length = 80)
    private int avesMuertas;

    @Column(nullable = false, length = 80)
    private double pesoPromedio;

    @OneToOne
    private TipoAlimento tipoAlimento;

    public RegistroDiario(LocalDate fecha, float cantidadAlimento, TipoAlimento tipoAlimento, int avesMuertas, double pesoPromedio) throws Exception {
        if (fecha == null) {
            throw new Exception("ERROR. cada registro debe tener una fecha");
        }
        if (cantidadAlimento < 1) {
            throw new Exception("ERROR. La cantidad de alimentos debe ser mayor a 0");
        }
        if (tipoAlimento == null) {
            throw new Exception("ERROR. cada registro debe tener una fecha");
        }
        if (avesMuertas < 0) {
            throw new Exception("ERROR. La cantidad de aves muertas debe ser un 0 (cero) o mayor");
        }
        if (pesoPromedio < 0) {
            throw new Exception("ERROR. El precio promedio debe ser un 0 (cero) o mayor");
        }
        this.fecha = LocalDate.now();
        this.cantidadAlimento = cantidadAlimento;
        this.tipoAlimento = tipoAlimento;
        this.avesMuertas = 0;
        this.pesoPromedio = 0;
    }

    public RegistroDiario() {
    }

    
    
    
    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
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

    public TipoAlimento getTipoAlimento() {
        return tipoAlimento;
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
