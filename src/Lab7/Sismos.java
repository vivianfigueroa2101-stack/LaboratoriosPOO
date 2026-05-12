package Lab7;

import java.util.ArrayList;

// exception
class SismoInvalidoException extends Exception {

    public SismoInvalidoException(String mensaje) {
        super(mensaje);
    }
}

// clase sismo
class Sismo {

    private String region;
    private String epicentro;
    private float magnitud;

    public Sismo(String region, String epicentro, float magnitud)
            throws SismoInvalidoException {

        if (region == null || region.isEmpty()) {
            throw new SismoInvalidoException("La región debe ser un String válido.");
        }

        if (epicentro == null || epicentro.isEmpty()) {
            throw new SismoInvalidoException("El epicentro debe ser un String válido.");
        }

        this.region = region;
        this.epicentro = epicentro;
        this.magnitud = magnitud;
    }

    @Override
    public String toString() {
        return "Región: " + region +
                " | Epicentro: " + epicentro +
                " | Magnitud: " + magnitud;
    }
}



