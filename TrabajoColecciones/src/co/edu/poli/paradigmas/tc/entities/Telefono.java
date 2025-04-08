package co.edu.poli.paradigmas.tc.entities;

public class Telefono {
	
	private int id;
	
	private String numero;

	public Telefono() {
		super();
	}

	public Telefono(int id, String numero) {
		super();
		this.id = id;
		this.numero = numero;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	

}
