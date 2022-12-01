package uvpavicol.main;

import uvpalivol.ui.Start;
import uvpavicol.clases.Empresa;
import uvpavicol.clases.Usuario;


public class UVPavicol {


    public static void main(String[] args) throws Exception {
     
        
        Empresa UVpavicol = new Empresa ("UVpavicol");
        Usuario usuario = new Usuario ("Cata", "Cata", "Cata");
        UVpavicol.addUsuario(usuario);
 
        new Start(UVpavicol).setVisible(true);
    }
    
}
