package org.ejercicio1_3;

public abstract class Envio {
    //Atributos
    private String codigo;
    private double distanciaKm;
    private double pesoKg;

    //Constructor

    public Envio(String codigo, double distanciaKm, double pesoKg) {
        this.codigo = codigo;
        this.distanciaKm = distanciaKm;
        this.pesoKg = pesoKg;
    }

    //Getter and Setter

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    //Metodo
    public abstract double calcularCosto();

    @Override
    public String toString() {
        return "Envio{" +
                "codigo='" + codigo + '\'' +
                ", distanciaKm=" + distanciaKm +
                ", pesoKg=" + pesoKg +
                '}';
    }
}
