package co.edu.poli.paradigmas.tc.negocio;

import co.edu.poli.paradigmas.tc.entities.TipoDocumento;

public class TipoDocumentoManager {
	
	public static TipoDocumento crearActualizarTipoDoc(int id, String nombre) {
		TipoDocumento miTipoDoc = new TipoDocumento(id, nombre);
		return miTipoDoc;
	}
	
}
