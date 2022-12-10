package uvpavicol.clases;

import java.util.LinkedList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import persistencia.GranjaJpaController;
import persistencia.LoteJpaController;
import persistencia.UsuarioJpaController;
import static uvpavicol.clases.TipoGranja.CONVENIO;

public class Empresa {

    private String nombre;

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Proyecto_UVPavicolPU");

    //private List<Usuario> losUsuarios = new LinkedList<>();
    private UsuarioJpaController usuarioJpaController = new UsuarioJpaController(emf);

    //private List<Lote> losLotes = new LinkedList<>(); 
    private LoteJpaController loteJpaController = new LoteJpaController(emf);

     //private List<Granja> lasGranjas = new LinkedList();
    private GranjaJpaController granjaJpaController = new GranjaJpaController(emf);

    public Empresa(String nombre) throws Exception {

        if (nombre == null || "".equals(nombre)) {
            throw new Exception("Porfavor digite el nombre de la empresa");
        }

        this.nombre = nombre;
    }

    //metodos de usuario
    public void addUsuario(Usuario Nuevo) throws Exception {
        usuarioJpaController.create(Nuevo);
    }

    public Usuario buscarUsuario(String email, String contra) throws RegistradoException {
        Usuario usuario = usuarioJpaController.findUsuario(email);

        if (usuario == null) {
            throw new RegistradoException("El usuario no fue registrado");

        }
        return usuario;
    }

    public void removeUsuarios(Usuario usuarios) {
        // this.losUsuarios.remove(usuarios);
    }

//----------------------------------------------------------------------------
    //metodos de Lote
    public void addLotes(Lote lotes) throws Exception {
        this.loteJpaController.create(lotes);
    }

    public void removeLotes(Lote lotes) {
        // this.losLotes.add(lotes);
    }

    public Lote unLote(String nombre) throws Exception {

        Lote lote = loteJpaController.findLote(nombre);
        if (lote == null) {
            throw new Exception("No se encuentra el lote ");
        }
        return lote;

    }

    public List<Usuario> getLosUsuarios() {
        return getLosUsuarios();
    }

    public void setLosUsuarios(List<Usuario> losUsuarios) {
        this.usuarioJpaController = usuarioJpaController;
    }

    
    
    
//----------------------------------------------------------------------------
    //metodos de granja

    public void addGranjas(Granja granjas) {
        this.granjaJpaController.create(granjas);
    }

    public void removeGranjas(Granja granjas) {
        // this.lasGranjas.remove(granjas);
    }

    public Granja unaGranja(String nombre) {
        for (int i = 0; i < getLasGranjas().size(); i++) {
            Granja registrado = getLasGranjas().get(i);
            if (nombre.equals(registrado.getNombre())) {
                return registrado;
            }
        }
        return null;
    }

    public Granja InfoPropietario() {
        for (int i = 0; i < this.granjaJpaController.getGranjaCount(); i++) {
            Granja info = this.granjaJpaController.findGranja(i);
            if (info.getTipoGranja() == CONVENIO) {
                return info;
            }
        }
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Lote> getLosLotes() {
        return getLosLotes();
    }

    public void setLosLotes(List<Lote> losLotes) {
        this.loteJpaController = loteJpaController;
    }

    public List<Granja> getLasGranjas() {
        return getLasGranjas();
    }

    public void setLasGranjas(List<Granja> lasGranjas) {
        this.granjaJpaController = granjaJpaController;
    }
    
    
    
}


