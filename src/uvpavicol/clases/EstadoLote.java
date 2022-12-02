
package uvpavicol.clases;


public enum EstadoLote {
    PRODUCCION,FINALIZADO;

    //METODOS GET
    public static EstadoLote getPRODUCCION() {
        return PRODUCCION;
    }

    //METODO SET    
    public static EstadoLote getFINALIZADO() {
        return FINALIZADO;
    }
    
}
