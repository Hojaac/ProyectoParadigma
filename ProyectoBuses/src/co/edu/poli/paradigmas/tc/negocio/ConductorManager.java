package co.edu.poli.paradigmas.tc.negocio;


import java.util.*;

import co.edu.poli.paradigmas.tc.entities.Conductor;


public class ConductorManager {
    private List<Conductor> conductores = new ArrayList<>();
    

    public void agregarConductor(Conductor c) {
        conductores.add(c);
    }

    public Conductor buscarConductor(int id) {
        return conductores.stream().filter(c -> c.getIdConductor() == id).findFirst().orElse(null);
    }

    public void editarLicencia(int id, String nuevaLicencia) {
        Conductor c = buscarConductor(id);
        if (c != null) c.setLicencia(nuevaLicencia);
    }

    public void eliminarConductor(int id) {
        conductores.removeIf(c -> c.getIdConductor() == id);
    }


}
