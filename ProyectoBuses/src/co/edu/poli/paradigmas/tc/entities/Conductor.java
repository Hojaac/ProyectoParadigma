package co.edu.poli.paradigmas.tc.entities;
public class Conductor {
	private int idConductor;
    private String nombre;
    private String licencia;

    public Conductor(int idConductor, String nombre, String licencia) {
        this.idConductor = idConductor;
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public int getIdConductor() {
        return idConductor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }
    // Constructor, Getters, Setters
}
