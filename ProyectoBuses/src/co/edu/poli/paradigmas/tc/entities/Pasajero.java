package co.edu.poli.paradigmas.tc.entities;
public class Pasajero{
private int idPasajero;
    private String nombre;
	
		

	    public Pasajero(int id, String nombre) {
	        this.idPasajero = id;
	        this.nombre = nombre;
	    }

	    

		public int getIdPasajero() {
	        return idPasajero;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }
	    
}
