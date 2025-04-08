package co.edu.poli.paradigmas.tc.negocio;

import java.util.List;

import co.edu.poli.paradigmas.tc.entities.Email;
import co.edu.poli.paradigmas.tc.entities.Persona;
import co.edu.poli.paradigmas.tc.entities.Telefono;
import co.edu.poli.paradigmas.tc.entities.TipoDocumento;

public class PersonaManager{
	
	public static Persona crearActualizarPersona(List<Email> misEmails, List<Telefono> misTelefonos, TipoDocumento miTipoDoc, long numDocumento,
			String nombre, String apellido) {
		Persona miP = new Persona(misEmails, misTelefonos, miTipoDoc, numDocumento, nombre, apellido);
		return miP;
	}
}