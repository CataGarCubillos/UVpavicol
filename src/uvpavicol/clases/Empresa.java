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
        if(nombre == null ||"".equals(nombre)){
            throw new Exception("Porfavor digite el nombre de la empresa");
        }
        this.nombre = nombre;
    }

    //metodos de usuario
    public void addUsuarios(Usuario usuarios) {
        this.losUsuarios.add(usuarios);
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
    public Lote unLote(String nombre) {
        for(int i = 0; i < getLosLotes().size();i++){
            Lote registrado = getLosLotes().get(i);
            if(nombre.equals(String.valueOf(registrado.getIdentificador()))){
                return registrado;
            }
        }        
        return null;
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
    public Granja unaGranja(String nombre) {
        for(int i = 0; i < getLasGranjas().size();i++){
            Granja registrado = getLasGranjas().get(i);
            if(nombre.equals(registrado.getNombre())){
                return registrado;
            }
        }        
        return null;
    }
    
    public void setLasGranjas(List<Granja> lasGranjas) {
        this.lasGranjas = lasGranjas;
    }
    public Granja InfoPropietario(){
        for(int i = 0;i<this.lasGranjas.size();i++){
            Granja info = this.lasGranjas.get(i);
            if(info.getTipoGranja()== CONVENIO ){
                return info;
            }
        }return null;
    }
}
