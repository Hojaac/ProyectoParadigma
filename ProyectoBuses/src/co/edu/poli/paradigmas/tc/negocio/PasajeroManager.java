package co.edu.poli.paradigmas.tc.negocio;


import java.util.*;
import co.edu.poli.paradigmas.tc.entities.Pasajero;
import co.edu.poli.paradigmas.tc.entities.Ruta;
public class PasajeroManager {
    private List<Pasajero> pasajeros = new ArrayList<>();
    

    public void agregarPasajero(Pasajero p) {
        pasajeros.add(p);
    }

    public Pasajero buscarPasajero(int id) {
        return pasajeros.stream().filter(p -> p.getIdPasajero() == id).findFirst().orElse(null);
    }

    public void editarNombrePasajero(int id, String nuevoNombre) {
        Pasajero p = buscarPasajero(id);
        if (p != null) p.setNombre(nuevoNombre);
    }

    public void eliminarPasajero(int id) {
        pasajeros.removeIf(p -> p.getIdPasajero() == id);
    }

	


 
  
}