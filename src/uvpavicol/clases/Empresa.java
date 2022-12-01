package uvpavicol.clases;

import java.util.LinkedList;
import java.util.List;
import static uvpavicol.clases.TipoGranja.CONVENIO;

public class Empresa {

    private String nombre;
    //no hay asociacion uno a uno
    //asociacion a muchos
    private List<Usuario> losUsuarios = new LinkedList<>();
    private List<Lote> losLotes = new LinkedList<>();
    private List<Granja> lasGranjas = new LinkedList();

    public Empresa(String nombre) throws Exception {

        nombre = nombre.trim();
        if (nombre.equals("")) {
            throw new Exception("Porfavor digite el nombre de la empresa");
        }

        this.nombre = nombre;
    }

    //metodos de usuario
    public void addUsuario(Usuario Nuevo) throws Exception {
        if (this.losUsuarios.contains(Nuevo)) {
            throw new Exception("el Usuario ya se encuentra registrado");
        } else {
            losUsuarios.add(Nuevo);
        }
    }
    
      public Usuario buscarUsuario (String email,String contra) throws RegistradoException{
        for(int i=0;i<this.losUsuarios.size();i++){
            Usuario usuario = this.losUsuarios.get(i);
            if(usuario.getCorreo().equals(email) && usuario.getPassword().equals(contra)){
                return usuario;
            } 
        }throw new RegistradoException("El usuario no fue registrado");
    }             
    public void removeUsuarios(Usuario usuarios) {
        this.losUsuarios.remove(usuarios);
    }

    public List<Usuario> getLosUusuarios() {
        return losUsuarios;
    }

    public void setLosUusuarios(List<Usuario> losUusuarios) {
        this.losUsuarios = losUusuarios;
    }

//----------------------------------------------------------------------------
    //metodos de Lote
    public void addLotes(Lote lotes) {
        this.losLotes.add(lotes);
    }

    public void removeLotes(Lote lotes) {
        this.losLotes.add(lotes);
    }

    public List<Lote> getLosLotes() {
        return losLotes;
    }

    public void setLosLotes(List<Lote> losLotes) {
        this.losLotes = losLotes;
    }
//----------------------------------------------------------------------------
    //metodos de granja

    public void addGranjas(Granja granjas) {
        this.lasGranjas.add(granjas);
    }

    public void removeGranjas(Granja granjas) {
        this.lasGranjas.remove(granjas);
    }

    public List<Granja> getLasGranjas() {
        return lasGranjas;
    }

    public void setLasGranjas(List<Granja> lasGranjas) {
        this.lasGranjas = lasGranjas;
    }

    public Granja InfoPropietario() {
        for (int i = 0; i < this.lasGranjas.size(); i++) {
            Granja info = this.lasGranjas.get(i);
            if (info.getTipoGranja() == CONVENIO) {
                return info;
            }
        }
        return null;
    }
}
