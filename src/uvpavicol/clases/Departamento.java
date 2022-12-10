
package uvpavicol.clases;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Departamento implements Serializable{
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int numero;
    
    //atributos 
    @Column (nullable = false, length = 80)
    private String nombre;
    //no hay asociacion uno a uno
    //no hay asociacion uno a muchos
    
    public Departamento(String nombre) throws Exception {
        if(nombre == null ||"".equals(nombre)){
            throw new Exception("Porfavor digite el nombre del departamento");
        }
        this.nombre = nombre;
    }

    public Departamento() {
    }

    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    
    
    //metodos get
    public String getNombre() {
        return nombre;
    }
    
    //metodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
