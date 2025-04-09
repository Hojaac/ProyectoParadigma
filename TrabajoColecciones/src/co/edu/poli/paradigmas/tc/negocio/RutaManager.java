package co.edu.poli.paradigmas.tc.negocio;

import co.edu.poli.paradigmas.tc.entities.Email;

public class EmailManager {
	
/*	public Email crearEmail(int id, String cuenta) {
		Email miEmail = new Email(id, cuenta);
		return miEmail;
	}
*/
	public static Email crearEmail(int id, String cuenta) {
		Email miEmail = new Email();
		miEmail.setId(id);
		miEmail.setCuenta(cuenta);
		return miEmail;
	}
	
	public static Email actualizarEmail(int id, String cuenta) {
		Email miEmail = new Email();
		miEmail.setCuenta(cuenta);
		return miEmail;
	}
	
}
