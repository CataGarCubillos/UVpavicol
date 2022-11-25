
package uvpavicol.clases;


class Propietario {
    //atributos propios
    private long identificacion;
    private String nombre;
    private String apellido;
    private long telefono;
    private String correo;
    //no hay uno a uno
    //no hay uno a muchos

    public Propietario(long identificacion, String nombre, String apellido, long telefono, String correo) throws Exception {
        if(!((identificacion>10000000 && identificacion<99999999)||(identificacion>1000000000l && identificacion<9999999999l))){
            Exception exc= new Exception("El numero de identificacion debe tener entre 8 y 10 digitos");
            throw exc;
        }
        if(nombre == null ||"".equals(nombre)){
            throw new Exception("Porfavor digite el nombre del Propietario");
        } 
        if(apellido == null ||"".equals(nombre)){
            throw new Exception("Porfavor digite el apellido del propietario");
        } 
        if(!((telefono>1000000 && telefono<9999999)||(telefono>1000000000l && telefono<9999999999l))){
            throw new Exception("El numero telefonico debe ser fijo de 7 digitos o celular de 10 digitos.");
        }
        if(correo == null ||"".equals(nombre)){
            throw new Exception("Porfavor digite el nombre del Munucipo");
        } 
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
    }
    //metods get 
    public long getIdentificacion() {
        return identificacion;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public long getTelefono() {
        return telefono;
    }
    public String getCorreo() {
        return correo;
    }

    //metodos set
    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
