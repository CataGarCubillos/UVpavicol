package uvpavicol.main;

import uvpalivol.ui.Start;
import uvpavicol.clases.Empresa;


public class UVPavicol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Empresa UVpavicol = new Empresa ("UVpavicol");
        new Start(UVpavicol).setVisible(true);
    }
    
}
