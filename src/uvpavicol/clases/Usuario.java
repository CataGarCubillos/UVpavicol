
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
        nombre = nombre.trim();
        if(nombre.equals("")){
            throw new Exception("El usuario debe tener un nombre");
        }         
        correo = correo.trim();
        if(correo.equals("")){
            throw new Exception("El usuario debe tener un correo");
        } 
        password = password.trim();
        if(password.equals("")){
            throw new Exception("El usuario debe tener una contraseña");
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
