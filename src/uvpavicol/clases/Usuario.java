
package uvpavicol.clases;


public class Usuario {
    //atributos propios
    private String nombre;
    private String correo;
    private String password;
    //asociacion uno a uno
    private Granja laGranja;
    //no hay asociacion a muchos
    
    public Usuario(String nombre, String correo, String password) throws Exception {
        if(nombre == null ||"".equals(nombre)){
            throw new Exception("Porfavor digite el nombre del Usuario");
        }         
        if(correo == null ||"".equals(nombre)){
            throw new Exception("Porfavor digite el nombre del Propietario");
        } 
        if(password == null ||"".equals(nombre)){
            throw new Exception("Porfavor digite el nombre del Propietario");
        } 
      
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
        this.laGranja = laGranja;
    }     
    
    //metodos get
    public String getNombre() {
        return nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public String getPassword() {
        return password;
    }
    public Granja getLaGranja() {
        return laGranja;
    }
    //metodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setLaGranja(Granja laGranja) {
        this.laGranja = laGranja;
    }
}
