package org.ejercicio1_3;

import java.util.ArrayList;
import java.util.List;

public class GestorEnvios {
    List<Envio> envios;

    public GestorEnvios() {
        this.envios = new ArrayList<>();
    }

    public void registrarEnvio(Envio envio) {
        if(this.envios.contains(envio)) {
            System.out.println("El envio existe en el sistema");
        }
        this.envios.add(envio);
    }


}
