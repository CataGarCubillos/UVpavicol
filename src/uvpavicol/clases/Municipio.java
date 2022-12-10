package uvpavicol.clases;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Municipio implements Serializable {

    //atrivutos propios
    @Id
    private String nombre;
    
    //no hay uno a uno
    @OneToOne
    private Departamento elDepartamento;

    
    //no hay uno a muchos
    public Municipio(String nombre, Departamento elDepartamento) throws Exception {
        if (nombre == null || "".equals(nombre)) {
            throw new Exception("Porfavor digite el nombre del Munucipo");
        }
        if (elDepartamento == null) {
            throw new Exception("Cada municipio debe tener un departamento especificado");
        }
        this.nombre = nombre;
        this.elDepartamento = elDepartamento;
    }

    public Municipio() {
    }

    //metodos get
    public String getNombre() {
        return nombre;
    }

    public Departamento getElDepartamento() {
        return elDepartamento;
    }

    //metodos set
    public void setElDepartamento(Departamento elDepartamento) {
        this.elDepartamento = elDepartamento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
