package co.edu.poli.paradigmas.tc.presentacion;




import co.edu.poli.paradigmas.tc.entities.Conductor;
import co.edu.poli.paradigmas.tc.entities.Pasajero;

import co.edu.poli.paradigmas.tc.entities.Ruta;
import co.edu.poli.paradigmas.tc.negocio.ConductorManager;
import co.edu.poli.paradigmas.tc.negocio.PasajeroManager;

import co.edu.poli.paradigmas.tc.negocio.RutaManager;


public class Presentacion {
	public static void main(String[] args) {
	PasajeroManager manager = new PasajeroManager();
	 RutaManager manager1 = new RutaManager();
	 ConductorManager manager2 = new ConductorManager();
    Pasajero p1 = new Pasajero(1, "Andy Cruz");
    Pasajero p2 = new Pasajero(2, "Vladick Arturo");
    Conductor c1 = new Conductor(1, "Carlos López", "ABC123");
    Conductor c2 = new Conductor(2, "María Díaz", "XYZ789");
    Ruta r1 = new Ruta(1, "Bogotá", 300.5);
    Ruta r2 = new Ruta(2, "Medellín", 420.0);
    
    
    manager.agregarPasajero(p1);
    manager.agregarPasajero(p2);
    manager1.agregarRuta(r1);
    manager1.agregarRuta(r2);
    manager2.agregarConductor(c1);
    manager2.agregarConductor(c2);

    Ruta encontrada = manager1.buscarRuta(1);
    System.out.println("Ruta encontrada: " + (encontrada != null ? encontrada.getDestino() : "No encontrada"));

    
    manager1.actualizarRuta(1, "Cali", 380.2);
    Ruta actualizada = manager1.buscarRuta(1);
    System.out.println("Ruta actualizada: " + actualizada.getDestino() + " - " + actualizada.getDistancia());

    manager1.eliminarRuta(2);
    Ruta eliminada = manager1.buscarRuta(2);
    System.out.println("¿Ruta 2 eliminada? " + (eliminada == null));
    Pasajero encontrado = manager.buscarPasajero(1);
    System.out.println("Pasajero encontrado: " + (encontrado != null ? encontrado.getNombre() : "No encontrado"));


    manager.editarNombrePasajero(2, "Juan Manuel");
    System.out.println("Nombre editado: " + manager.buscarPasajero(2).getNombre());


    manager.eliminarPasajero(1);
    System.out.println("¿Pasajero 1 eliminado? " + (manager.buscarPasajero(1) == null));
    Conductor encontrado1 = manager2.buscarConductor(1);
    System.out.println("Conductor encontrado: " + (encontrado1 != null ? encontrado.getNombre() : "No encontrado"));

 
    manager2.editarLicencia(1, "NUEVA456");
    Conductor actualizado = manager2.buscarConductor(1);
    System.out.println("Licencia actualizada: " + actualizado.getLicencia());

  
    manager2.eliminarConductor(2);
    Conductor eliminado = manager2.buscarConductor(2);
    System.out.println("¿Conductor 2 eliminado? " + (eliminado == null));
	
	}
}
