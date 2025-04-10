package co.edu.poli.paradigmas.tc.entities;

public class Ruta {
    private int idRuta;
    private String destino;
    private double distancia;

    public Ruta(int idRuta, String destino, double distancia) {
        this.idRuta = idRuta;
        this.destino = destino;
        this.distancia = distancia;
    }

    public int getIdRuta() {
        return idRuta;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
}

