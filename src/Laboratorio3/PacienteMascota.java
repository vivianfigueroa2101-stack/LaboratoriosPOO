package Laboratorio3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PacienteMascota {
    //para registrar cada animal en el sistema

    private String nombreMascota;
    Especie especie;
    private int pesoIdeal;
    private String nombreDueño;
    private LocalDate fechaProximaVacuna;

    //constructor


    public PacienteMascota(String nombreMascota, Especie especie, int pesoIdeal, String nombreDueño, LocalDate fechaProximaVacuna) {
        this.nombreMascota = nombreMascota;
        this.especie = especie;
        this.pesoIdeal = pesoIdeal;
        this.nombreDueño = nombreDueño;
        this.fechaProximaVacuna = fechaProximaVacuna;

    }

    public static String nombreRedVeterinaria = "Vet Plus";

    //Metodos
    public LocalDate getFechaProximaVacuna() {
        return fechaProximaVacuna;
    }

    public static String ActualizarNombreRed(String nuevoNombre) {
        nombreRedVeterinaria = nuevoNombre;
        return nuevoNombre;
    }

    public int RestanteVacuna() {
        long dias = ChronoUnit.DAYS.between(LocalDate.now(), this.fechaProximaVacuna);
        int restante = (int) dias;
        return restante;
    }

    @Override
    public String toString() {
        return nombreMascota + "; " + this.nombreMascota + "; " + this.especie + "; " + this.pesoIdeal + "; " + this.nombreDueño ;
    }


}









