package org.ejercicio1_3;

public class EnvioNacional extends Envio {
    //Atributos
    private String regionDestino;
    private boolean urgente;

    //Constructor
    public EnvioNacional(String codigo, double distanciaKm, double pesoKg, String regionDestino, boolean urgente) {
        super(codigo, distanciaKm, pesoKg);
        this.regionDestino = regionDestino;
        this.urgente = urgente;
    }
    //Getter and Setter

    public String getRegionDestino() {
        return regionDestino;
    }

    public void setRegionDestino(String regionDestino) {
        this.regionDestino = regionDestino;
    }

    public boolean isUrgente() {
        return urgente;
    }

    public void setUrgente(boolean urgente) {
        this.urgente = urgente;
    }

    //Metodo

    @Override
    public double calcularCosto() {
        double costoBase = 8000 + ( getDistanciaKm() * 60) + ( getPesoKg() * 500);
        if (urgente) {
            costoBase = costoBase * 1.25;
        }
        return costoBase;
    }
}
