package managed;

import entidades.TipoActividad;
import entidades.HandPlantas;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import modelo.GestionActCent;

@ManagedBean(name= "tiposact")
@SessionScoped

public class beanTipos implements Serializable {
    
    private HandPlantas[] centro;
    List<TipoActividad>act;
    List<HandPlantas> listCentros;
    List<TipoActividad> listAct;
    private String PLT_cc;
    private String descripcion;
    private int cant_ini;
    private int cant_fin;
    
    
    @ManagedProperty("#{gestact}")
    private GestionActCent gestion;

    public beanTipos() {
    }
    
    


    public HandPlantas[] getCentro() {
        return centro;
    }

    public void setCentro(HandPlantas[] centro) {
        this.centro = centro;
    }

    public List<TipoActividad> getAct() {
        return act;
    }

    public void setAct(List<TipoActividad> act) {
        this.act = act;
    }
   
    public List<HandPlantas> getListCentros() {
        listCentros = gestion.listarCentros();
        return listCentros;
    }

    public void setListCentros(List<HandPlantas> listCentros) {
        this.listCentros = listCentros;
    }

    public List<TipoActividad> getListAct() {
        listAct=gestion.listarActividades();
        return listAct;
    }

    public void setListAct(List<TipoActividad> listAct) {
        this.listAct = listAct;
    }

    public GestionActCent getGestion() {
        return gestion;
    }

    public void setGestion(GestionActCent gestion) {
        this.gestion = gestion;
    }

    public String getPLT_cc() {
        return PLT_cc;
    }

    public void setPLT_cc(String PLC_cc) {
        this.PLT_cc = PLC_cc;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCant_ini() {
        return cant_ini;
    }

    public void setCant_ini(int cant_ini) {
        this.cant_ini = cant_ini;
    }

    public int getCant_fin() {
        return cant_fin;
    }

    public void setCant_fin(int cant_fin) {
        this.cant_fin = cant_fin;
    }
    
    
    
    public List<TipoActividad> consultar(){
        gestion.filtroActividad(PLT_cc, descripcion, cant_ini, cant_fin);
        
        return act;
    }

   
    
  
}