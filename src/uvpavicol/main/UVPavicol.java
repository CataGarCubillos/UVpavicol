package uvpavicol.main;

import java.time.LocalDate;
import uvpalivol.ui.Start;
import uvpavicol.clases.Departamento;
import uvpavicol.clases.Empresa;
import uvpavicol.clases.EstadoConvenio;
import uvpavicol.clases.EstadoLote;
import uvpavicol.clases.Galpon;
import uvpavicol.clases.Granja;
import uvpavicol.clases.Lote;
import uvpavicol.clases.Municipio;
import uvpavicol.clases.Propietario;
import uvpavicol.clases.RegistroDiario;
import uvpavicol.clases.TipoAlimento;
import uvpavicol.clases.TipoGranja;
import uvpavicol.clases.Usuario;

public class UVPavicol {

    public static void main(String[] args) throws Exception {

        Empresa UVpavicol = new Empresa("UVpavicol");
        
        UVpavicol.addGranjas(new Granja("prueba", EstadoConvenio.VIGENTE, TipoGranja.PROPIA,
                new Municipio("nombre", new Departamento("nombreDep")),
                new Propietario(12345678, "nombre prop", "apellido", 1234567, "correo")));

        UVpavicol.unaGranja("prueba").addGalpones(new Galpon(1, 100));
        UVpavicol.addLotes(new Lote(LocalDate.MIN, new Galpon(2, 200), 5, 1, EstadoLote.PRODUCCION));

        float alimento = 1;
        UVpavicol.unLote("1").addRegistroDiario(new RegistroDiario(LocalDate.now(), alimento, TipoAlimento.CRECIMIENTO, 0, 0));

        Usuario usuario = new Usuario("Cata", "Cata", "Cata");
        UVpavicol.addUsuario(usuario);

        new Start(UVpavicol).setVisible(true);
    }

}
