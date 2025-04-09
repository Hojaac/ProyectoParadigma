package co.edu.poli.paradigmas.tc.entities;

import java.util.List;

public class Persona{
	private List<Email> misEmails;
	
	private List<Telefono> misTelefonos;
	
	private TipoDocumento miTipoDoc;
	
	private long numDocumento;
	
	private String nombre;
	
	private String apellido;

	public Persona() {
		super();
	}

	public Persona(List<Email> misEmails, List<Telefono> misTelefonos, TipoDocumento miTipoDoc, long numDocumento,
			String nombre, String apellido) {
		super();
		this.misEmails = misEmails;
		this.misTelefonos = misTelefonos;
		this.miTipoDoc = miTipoDoc;
		this.numDocumento = numDocumento;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public List<Email> getMisEmails() {
		return misEmails;
	}

	public void setMisEmails(List<Email> misEmails) {
		this.misEmails = misEmails;
	}

	public List<Telefono> getMisTelefonos() {
		return misTelefonos;
	}

	public void setMisTelefonos(List<Telefono> misTelefonos) {
		this.misTelefonos = misTelefonos;
	}

	public TipoDocumento getMiTipoDoc() {
		return miTipoDoc;
	}

	public void setMiTipoDoc(TipoDocumento miTipoDoc) {
		this.miTipoDoc = miTipoDoc;
	}

	public long getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(long numDocumento) {
		this.numDocumento = numDocumento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String listaEmails() {
		String cadena="";
		for(Email e: misEmails) {
			cadena+=e.getCuenta()+", ";
		}
		return cadena;
	}
	
	public String listaTelefonos() {
		String cadena="";
		for(Telefono e: misTelefonos) {
			cadena+=e.getNumero()+", ";
		}
		return cadena;
	}

	@Override
	public String toString() {
		return "Persona [misEmails=" +  listaEmails() + ", misTelefonos=" + listaTelefonos() + ", miTipoDoc=" + miTipoDoc.getNombre()
				+ ", numDocumento=" + numDocumento + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
	
}
