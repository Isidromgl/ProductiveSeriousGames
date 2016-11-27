package modelo;
import entidades.MedallasUsuario;
import java.util.List;
import entidades.MedallasusuRetos;
import entidades.Retos;
public interface MedallasUsu {
    List<MedallasusuRetos> obtenerMedallasUsu(String nombre_medalla,
            List<String> nombre_reto, 
            String valorMin,
            String valorMax,
            java.sql.Date fecha_inicio, //Las fechas sobre las que hay que operar son las de la tabla "retos"
            java.sql.Date fecha_final,
            String puntos);
    
    List<Retos> obtenerListaRetos();
    public boolean agregarMedallasUsu(MedallasusuRetos medret, Retos ret, MedallasUsuario usu);
    public boolean eliminarMedallasUsu(MedallasusuRetos medret, Retos ret, MedallasUsuario usu);
    public void modificarMedallasUsu(MedallasusuRetos medret, Retos ret, MedallasUsuario usu);
    
}
