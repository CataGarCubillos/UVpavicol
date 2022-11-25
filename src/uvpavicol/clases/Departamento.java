
package uvpavicol.clases;


public class Departamento {
    //atributos 
    private String nombre;
    //no hay asociacion uno a uno
    //no hay asociacion uno a muchos
    
    public Departamento(String nombre) throws Exception {
        if(nombre == null ||"".equals(nombre)){
            throw new Exception("Porfavor digite el nombre del departamento");
        }
        this.nombre = nombre;
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
