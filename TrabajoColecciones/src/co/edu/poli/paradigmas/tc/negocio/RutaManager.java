package co.edu.poli.paradigmas.tc.negocio;

import co.edu.poli.paradigmas.tc.entities.Email;

import java.util.*;

public class RutaManager {
    private List<Ruta> rutas = new ArrayList<>();
    private List<Estacion> estaciones = new ArrayList<>();

    public void agregarRuta(Ruta ruta) {
        rutas.add(ruta);
    }

    public Ruta buscarRuta(int id) {
        return rutas.stream().filter(r -> r.getIdRuta() == id).findFirst().orElse(null);
    }

    public void actualizarRuta(int id, String destino, double distancia) {
        Ruta r = buscarRuta(id);
        if (r != null) {
            r.setDestino(destino);
            r.setDistancia(distancia);
        }
    }

    public void eliminarRuta(int id) {
        rutas.removeIf(r -> r.getIdRuta() == id);
    }

    public void agregarEstacion(Estacion est) {
        estaciones.add(est);
    }

    public List<Estacion> obtenerEstacionesPorRuta(int idRuta) {
        estaciones.sort(Comparator.comparingInt(Estacion::getOrden));
        return estaciones.stream().filter(e -> e.getIdRuta() == idRuta).toList();
    }
}
