package uvpavicol.clases;

//la clase EstadoConvenio, es una clase enumerada.
public enum EstadoConvenio {
    VIGENTE, FINALIZADO;
    
    //metodo get
    public static EstadoConvenio getVIGENTE() {
        return VIGENTE;
    }
    //metodo set
    public static EstadoConvenio getFINALIZADO() {
        return FINALIZADO;
    }
}
