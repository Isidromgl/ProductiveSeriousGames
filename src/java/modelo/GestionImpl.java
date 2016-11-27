/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import entidades.TipoActividad;
import entidades.HandPlantas;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component(value="gestact")
public class GestionImpl implements GestionActCent, Serializable{
    
    @PersistenceContext(name="P_S_GPU")
    EntityManager em;
    
    public GestionImpl() {
    }
    
    @Transactional()
    @Override
    public boolean persist (Object object){
        //em.persist(object);
        return true;
    }
    
    @Override
    public List<TipoActividad> listarActividades(){
    Query q= em.createNamedQuery("TipoActividad.findAll");
    List<TipoActividad> listact;
    listact=q.getResultList();
    return listact;
    }
    
    @Override
    public List<HandPlantas> listarCentros(){
        Query q=em.createNamedQuery("HandPlantas.findAll");
        List<HandPlantas> listaplant;
        listaplant=q.getResultList();
        return listaplant;
    }
    
    @Override
    public List<TipoActividad> filtroActividad(String PLT_Cc, String descripcion, int cant_ini, int cant_fin){
        
      
        String jpql="select t from TipoActividad where";
        jpql+="t.descripción:descripcion and t.cantidad_inicial=: cant_ini and t.cantidad_final=:cant_fin and and t.PLT_Cc=: PLT_Cc";
         
        Query q=em.createQuery(jpql);
        q.setParameter("descripción", descripcion);
        q.setParameter("cantidad_inicial",cant_ini);
        q.setParameter("cantidad_final",cant_fin);
        q.setParameter("PLT_Cc", PLT_Cc);
        
        List<TipoActividad>  Actividad=(List<TipoActividad>) q.getResultList();
       
        return Actividad;
    }
  
    

}