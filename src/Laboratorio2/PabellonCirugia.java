package Laboratorio2;

import java.util.Objects;

public class PabellonCirugia {
    private int numero ;
    private String especialidad ;
    private Estado estado ;

    public PabellonCirugia(int num, String especialidad) {
        this.numero = num;
        this.especialidad = especialidad;
        this.estado = Estado.DISPONIBLE;
    }

    public int getNumero() {
        return numero;
    }

    public String getEspecialidad() {
    return especialidad;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        String estadoTexto = (estado == Estado.OCUPADO) ? "ocupado" : "disponible";
        return numero + "," + especialidad + "," + estadoTexto;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PabellonCirugia that = (PabellonCirugia) o;
        return this.numero == that.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, especialidad, estado);
    }
}
