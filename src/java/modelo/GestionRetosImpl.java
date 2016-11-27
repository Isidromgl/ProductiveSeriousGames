package modelo;


import entidades.Retos;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.springframework.stereotype.Component;
 
@Component(value="gestionRetos")
public class GestionRetosImpl implements GestionRetos{
    @PersistenceContext(name="P_S_GPU")
    EntityManager em;
    
    @Transactional()   
    @Override
    public boolean altaRetos(Retos r){
        //em.persist(r);
        return true;
    }
     

    @Override
    public List<Retos> obtenerRetos( ) {
        Query q=em.createNamedQuery("Retos.findAll"); //Lista entera de retos con 
        
        List<Retos> listado;
        listado= q.getResultList();
        return listado;
        
    }
    
  
    @Override
    public void eliminarReto(){
        String sql = "DELETE FROM Retos r WHERE r.idretos = :idretos";//eliminamos por nombre??? Falta en la vista
        Query q=em.createQuery(sql);
        q.executeUpdate();
    }
    
     
     @Override
    public void modificarReto(Retos r){//falta esta opcion en la vista
        em.persist(r);

    }
}