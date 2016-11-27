package managed;

import entidades.MedallasAlmacen;
import modelo.MedallasAlm;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import entidades.MedallasplantRetos;
import entidades.Retos;


@ManagedBean(name = "gestionMedallaAlm")
@SessionScoped
public class gestionMedallaAlm implements Serializable{
    
   private List<String> nombre_centro;
   private String nombre_medalla;
   private List<String> nombre_reto;
   private String valorMin;
   private String valorMax;
   private java.sql.Date fechaMin;
   private java.sql.Date fechaMax;
   private String puntos;

   private MedallasAlmacen medallasalmacen;
   private MedallasplantRetos medallasplantreto;
   private Retos retos;
   
   private List<MedallasAlmacen> medallasalmacenlist;
   private List<MedallasplantRetos> medallasretosplantlist;
   private List<Retos> retoslist;
    
    @ManagedProperty("#{gestionMedallasAlm}")
    MedallasAlm medallasalm;
   
    public gestionMedallaAlm() {
    }

    public List<String> getNombre_centro() {
        return nombre_centro;
    }

    public void setNombre_centro(List<String> nombre_centro) {
        this.nombre_centro = nombre_centro;
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

    public MedallasAlmacen getMedallasalmacen() {
        return medallasalmacen;
    }

    public void setMedallasalmacen(MedallasAlmacen medallasalmacen) {
        this.medallasalmacen = medallasalmacen;
    }

    public MedallasplantRetos getMedallasplantreto() {
        return medallasplantreto;
    }

    public void setMedallasplantreto(MedallasplantRetos medallasplantreto) {
        this.medallasplantreto = medallasplantreto;
    }

    public Retos getRetos() {
        return retos;
    }

    public void setRetos(Retos retos) {
        this.retos = retos;
    }

    public List<MedallasAlmacen> getMedallasalmacenlist() {
        medallasalmacenlist = medallasalm.obtenerListaCentros();
        return medallasalmacenlist;
    }

    public void setMedallasalmacenlist(List<MedallasAlmacen> medallasalmacenlist) {
        this.medallasalmacenlist = medallasalmacenlist;
    }

    public List<MedallasplantRetos> getMedallasretosplantlist() {
        return medallasretosplantlist;
    }

    public void setMedallasretosplantlist(List<MedallasplantRetos> medallasretosplantlist) {
        this.medallasretosplantlist = medallasretosplantlist;
    }

    public List<Retos> getRetoslist() {
        retoslist = medallasalm.obtenerListaRetos();
        return retoslist;
    }

    public void setRetoslist(List<Retos> retoslist) {
        this.retoslist = retoslist;
    }

    public MedallasAlm getMedallasalm() {
        return medallasalm;
    }

    public void setMedallasalm(MedallasAlm medallasalm) {
        this.medallasalm = medallasalm;
    }

    
    //Métodos que vienen del interfaz
    
    public List<MedallasplantRetos> obtenerMedallasAlm(){
       List<MedallasplantRetos> medallasplantlist2 = medallasalm.obtenerMedallasAlm(nombre_centro, nombre_medalla, nombre_reto, valorMin, valorMax, fechaMin, fechaMax, puntos);
        return medallasplantlist2;
    }
    public String agregarMedallasAlm(){
        medallasalm.agregarMedallasAlm(medallasplantreto, retos, medallasalmacen);
        return "crearMedallaAlm";
    }
    
    public String modificarMedallasAlm(){
        medallasalm.modificarMedallasAlm(medallasplantreto, retos, medallasalmacen);
        return "";
    }

    public String eliminarMedallasAlm(){
        medallasalm.eliminarMedallasAlm(medallasplantreto, retos, medallasalmacen);
        return "";
    }
}