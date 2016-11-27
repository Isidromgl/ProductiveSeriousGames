
package managed;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import modelo.GestionRetos;
import entidades.Retos;
import java.util.List;

//todos los métodos aquí y añade las variables despúes del public class y aquí es donde se pone el List<String>Retos

@ManagedBean
@SessionScoped
public class gestionRetos {
   private Retos reto;
   List<Retos> listadoRetos;
   List<Retos> RetosSelec;
    
    @ManagedProperty("#{gestionRetos}")
    GestionRetos gestion;
    
    public gestionRetos(GestionRetos gestion) {
        this.gestion = gestion;
    }

    public gestionRetos() {
        
    }

    public Retos getReto() {
        return reto;
    }

    public void setReto(Retos reto) {
        this.reto = reto;
    }
    
    public List<Retos> getListadoRetos() {
        listadoRetos = gestion.obtenerRetos();
        return listadoRetos;
    }

    public void setRetos(List retos) {
        this.listadoRetos = retos;
    }

    public GestionRetos getGestion() {
        return gestion;
    }

   
  public void setGestion(GestionRetos gestion) {
        this.gestion = gestion;
    }
  
    public String alta(){
        gestion.altaRetos(reto);
        return "crearReto";//ponemos el nombre de la vista en que se cargaría
    }
//    public gestionRetos() {
//    }
    public String modificarReto(){
        gestion.modificarReto(reto); //falta en la vista
       return "consulta_reto"; 
    }
    public String eliminarReto(){//falta en la vista
        gestion.eliminarReto();
        return "consulta_reto";
    }
    public List<Retos> getRetosSelec(){   //esto no haría falta
        RetosSelec = gestion.obtenerRetos( );
        return RetosSelec;//
    }
}

