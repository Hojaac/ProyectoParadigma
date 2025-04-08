package co.edu.poli.paradigmas.tc.negocio;

import co.edu.poli.paradigmas.tc.entities.Telefono;

public class TelefonoManager {
	
	public static Telefono crearActualizarTelefono(int id, String numero) {
		Telefono miTel = new Telefono(id, numero);
		return miTel;
	}
}
