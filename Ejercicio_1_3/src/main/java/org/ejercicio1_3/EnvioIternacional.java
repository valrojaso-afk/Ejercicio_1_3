package org.ejercicio1_3;

public class EnvioIternacional extends Envio implements Asegurable {
    //Atributo
    private String paisDestino;
    private boolean documentacionAduaneraAlDia;

    //Constructor

    public EnvioIternacional(String codigo, double distanciaKm, double pesoKg, String paisDestino, boolean documentacionAduaneraAlDia) {
        super(codigo, distanciaKm, pesoKg);
        this.paisDestino = paisDestino;
        this.documentacionAduaneraAlDia = documentacionAduaneraAlDia;
    }

    //Getter and Setter

    public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    public boolean isDocumentacionAduaneraAlDia() {
        return documentacionAduaneraAlDia;
    }

    public void setDocumentacionAduaneraAlDia(boolean documentacionAduaneraAlDia) {
        this.documentacionAduaneraAlDia = documentacionAduaneraAlDia;
    }

    //Metodo Abstracto

    @Override
    public double calcularCosto() {
        double costoBase = 20000 + (getDistanciaKm() * 90) + (getPesoKg() * 1200);
        if(!documentacionAduaneraAlDia) {
            costoBase = costoBase * 1.15;
        }
        return costoBase;
    }

    @Override
    public double calcularSeguro() {
        return calcularCosto() * 0.08;
    }
}
