package co.edu.poli.paradigmas.tc.negocio;

import co.edu.poli.paradigmas.tc.entities.Telefono;

import java.util.*;

public class ConductorManager {
    private List<Conductor> conductores = new ArrayList<>();
    private List<Vehiculo> vehiculos = new ArrayList<>();

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

    public void agregarVehiculo(Vehiculo v) {
        vehiculos.add(v);
    }

    public Vehiculo buscarVehiculo(String placa) {
        return vehiculos.stream().filter(v -> v.getPlaca().equals(placa)).findFirst().orElse(null);
    }

    public void cambiarEstadoVehiculo(String placa, String nuevoEstado) {
        Vehiculo v = buscarVehiculo(placa);
        if (v != null) v.setEstado(nuevoEstado);
    }

    public void eliminarVehiculo(String placa) {
        vehiculos.removeIf(v -> v.getPlaca().equals(placa));
    }
}
