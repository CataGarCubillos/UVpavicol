
package uvpavicol.clases;


 public class Municipio {
    //atrivutos propios
    private String nombre;
    private Departamento elDepartamento;
    //no hay uno a uno
    //no hay uno a muchos
    public Municipio(String nombre, Departamento elDepartamento) throws Exception {
        if(nombre == null ||"".equals(nombre)){
            throw new Exception("Porfavor digite el nombre del Munucipo");
        }
        if(elDepartamento == null ){
            throw new Exception("Cada municipio debe tener un departamento especificado");
        }
        this.nombre = nombre;
        this.elDepartamento = elDepartamento;
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
