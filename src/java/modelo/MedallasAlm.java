
package modelo;

import entidades.MedallasAlmacen;
import java.util.List;
import entidades.MedallasplantRetos;
import entidades.Retos;


public interface MedallasAlm {
    List<MedallasplantRetos> obtenerMedallasAlm(List<String> nombre_centro,
            String nombre_medalla, //almacén
            List<String> nombre_reto,           
            String valorMin,
            String valorMax,
            java.sql.Date fechaMin,
            java.sql.Date fechaMax,           
            String puntos);
    
    List<MedallasAlmacen> obtenerListaCentros();
    List<Retos> obtenerListaRetos();
    public boolean agregarMedallasAlm(MedallasplantRetos medplant, Retos ret, MedallasAlmacen alm);
    public boolean eliminarMedallasAlm(MedallasplantRetos medplant, Retos ret, MedallasAlmacen alm);
    public void modificarMedallasAlm(MedallasplantRetos medplant, Retos ret, MedallasAlmacen alm);
}