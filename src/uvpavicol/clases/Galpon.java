
package uvpavicol.clases;


public class Galpon {
    //atributos propios
    private int identificador;
    private long cantidadAves;
    //no hay asociacion uno a uno
    //no hay asociacion uno a muchos

    public Galpon(int identificador, long cantidadAves) throws Exception {
        if(identificador <0){
            throw new Exception("El identificador no puede ser un valor negativo");
        }
        if(cantidadAves <0){
            throw new Exception("ERROR. La cantidad de aves en los galpones debe ser 0 (cero) o mayor ");
        }
        this.identificador = identificador;
        this.cantidadAves = cantidadAves;
    }

    //metodos get
    public int getIdentificador() {
        return identificador;
    }
    public long getCantidadAves() {
        return cantidadAves;
    }

    //metodos set
    public void setCantidadAves(long cantidadAves) {
        this.cantidadAves = cantidadAves;
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    } 
    
      @Override
    public String toString() {
        return  "id:" + identificador;
    }
}
