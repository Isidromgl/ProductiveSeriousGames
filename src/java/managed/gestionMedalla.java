package managed;
import entidades.MedallasUsuario;
import modelo.MedallasUsu;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import entidades.MedallasusuRetos;
import entidades.Retos;
@ManagedBean (name= "gestionMedallas")
@RequestScoped
public class gestionMedalla implements Serializable{
  
   private String nombre_medalla;
   private List<String> nombre_reto;
   private String valorMin;
   private String valorMax;
   private java.sql.Date fechaMin;
   private java.sql.Date fechaMax;
   private String puntos;
   
   private MedallasUsuario medallasusuario;
   private MedallasusuRetos medallasusuretos;
   private Retos retos;
   
   private List<MedallasUsuario> medallasusuariolist;
   private List<MedallasusuRetos> medallasretolist;
   private List<Retos> retoslist;
   
   @ManagedProperty("#{gestionMedallasUsu}")
   private MedallasUsu medallasusu;
   
   public gestionMedalla(){    
   }
    
    public String getNombre_medalla() {
        return nombre_medalla;
    }
    public void setNombre_medalla(String nombre_medalla) {
        this.nombre_medalla = nombre_medalla;
    }
    public List<String> getNombre_reto() {
        return nombre_reto;
    }
    public void setNombre_reto(List<String> nombre_reto) {
        this.nombre_reto = nombre_reto;
    }
    public String getValorMin() {
        return valorMin;
    }
    public void setValorMin(String valorMin) {
        this.valorMin = valorMin;
    }
    public String getValorMax() {
        return valorMax;
    }
    public void setValorMax(String valorMax) {
        this.valorMax = valorMax;
    }
    public Date getFechaMin() {
        return fechaMin;
    }
    public void setFechaMin(Date fechaMin) {
        this.fechaMin = fechaMin;
    }
    public Date getFechaMax() {
        return fechaMax;
    }
    public void setFechaMax(Date fechaMax) {
        this.fechaMax = fechaMax;
    }
    public String getPuntos() {
        return puntos;
    }
    public void setPuntos(String puntos) {
        this.puntos = puntos;
    }
    public MedallasUsuario getMedallasusuario() {
        return medallasusuario;
    }
    public void setMedallasusuario(MedallasUsuario medallasusuario) {
        this.medallasusuario = medallasusuario;
    }
    public MedallasusuRetos getMedallasusuretos() {
        return medallasusuretos;
    }
    public void setMedallasusuretos(MedallasusuRetos medallasusuretos) {
        this.medallasusuretos = medallasusuretos;
    }
    public Retos getRetos() {
        return retos;
    }
    public void setRetos(Retos retos) {
        this.retos = retos;
    }
    public List<MedallasUsuario> getMedallasusuariolist() {
        return medallasusuariolist;
    }
    public void setMedallasusuariolist(List<MedallasUsuario> medallasusuariolist) {
        this.medallasusuariolist = medallasusuariolist;
    }
    public List<MedallasusuRetos> getMedallasretolist() {
        return medallasretolist;
    }
    public void setMedallasretolist(List<MedallasusuRetos> medallasretolist) {
        this.medallasretolist = medallasretolist;
    }
    public List<Retos> getRetoslist() {
        retoslist = medallasusu.obtenerListaRetos();
        return retoslist;
    }
    
    public void setRetoslist(List<Retos> retoslist) {
        this.retoslist = retoslist;
    }
    public MedallasUsu getMedallasusu() {
        return medallasusu;
    }
    public void setMedallasusu(MedallasUsu medallasusu) {
        this.medallasusu = medallasusu;
    }
    
    //Métodos que vienen del interfaz
    
    public List<MedallasusuRetos> obtenerMedallasUsu(){
        List<MedallasusuRetos> medallasretolist2 = medallasusu.obtenerMedallasUsu(nombre_medalla, nombre_reto, valorMin, valorMax, fechaMin, fechaMax, puntos);    
        return medallasretolist2;
    }
    
    public String agregarMedallasUsu(){
        medallasusu.agregarMedallasUsu(medallasusuretos, retos, medallasusuario);
        return "crearMedallaUser";
    }
    
    public String modificarMedallasUsu(){
        medallasusu.modificarMedallasUsu(medallasusuretos, retos, medallasusuario);
        return "";
    }
    public String eliminarMedallasUsu(){
        medallasusu.eliminarMedallasUsu(medallasusuretos, retos, medallasusuario);
        return "";
    } 
    
}