package uvpavicol.clases;



//la clase TipoGranja, es una clase enumerada.
public enum TipoGranja {
    PROPIA, CONVENIO;

    //metodos get
    public static TipoGranja getPROPIA() {
        return PROPIA;
    }
    public static TipoGranja getCONVENIO() {
        return CONVENIO;
    }
}
