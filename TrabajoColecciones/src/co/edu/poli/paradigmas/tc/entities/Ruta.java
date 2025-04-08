package co.edu.poli.paradigmas.tc.entities;

public class Email {
	
	private int id;
	
	private String cuenta;
	

	public Email() {
		super();
	}

	public Email(int id, String cuenta) {
		super();
		this.id = id;
		this.cuenta = cuenta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	

}
