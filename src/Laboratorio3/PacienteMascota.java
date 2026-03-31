package Laboratorio3;

import java.time.LocalDate;

public class PacienteMascota {
    //para registrar cada animal en el sistema

    private String nombreMascota;
    private Especie especie;
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

    public static String nombreRedVeterinaria; {
        nombreRedVeterinaria = "VetPlus";
    }

    //Fecha vacunación programadas


    //Metodos
    public LocalDate getFechaProximaVacuna() {
        return fechaProximaVacuna;
    }

    public static String ActualizarNombreRed(String nuevoNombre) {
        nombreRedVeterinaria = nuevoNombre;
        return nuevoNombre;
    }


}









