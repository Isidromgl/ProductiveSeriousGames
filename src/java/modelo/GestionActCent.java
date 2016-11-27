package modelo;

import entidades.TipoActividad;
import entidades.HandPlantas;
import java.util.ArrayList;
import java.util.List;

public interface GestionActCent{
   boolean persist(Object object);

   List<TipoActividad> listarActividades();

   List<HandPlantas> listarCentros();

   List<TipoActividad> filtroActividad(String PLT_Cc, String descripcion, int cant_ini, int cant_fin);

   
   
}