/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package uvpavicol.clases;

/**
 *
 * @author W10
 */
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
