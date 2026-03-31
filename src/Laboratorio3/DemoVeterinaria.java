package Laboratorio3;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class DemoVeterinaria {
    public static void main(String[] args) {

        //Almacenamiento
        ArrayList<PacienteMascota> listaPacientes = new ArrayList<>();

        //obtenemos fechas
        int anioActual = LocalDate.now().getYear();
        LocalDate fechaCANINOS = LocalDate.of(anioActual, Month.APRIL, 15);
        LocalDate fechaFELINONS = LocalDate.of(anioActual, Month.MAY, 10);
        LocalDate fechaEXOTICOS = LocalDate.of(anioActual, Month.JUNE, 5);

        LocalDate[] fechas = {fechaCANINOS, fechaFELINONS, fechaEXOTICOS};
        Especie[] especies = Especie.values();

        System.out.println("--- Registro de Nuevos Pacientes ---");
        for(int i = 0; i < listaPacientes.size(); i++){
            PacienteMascota paciente = listaPacientes.get(i);
            System.out.println("\nIngrese los datos para la especie de " + especies[i] + ":");

            System.out.println("Ingrese nombre de la mascota")
                    int nombre = scanner.next();
            System.out.println("Ingrese especie de la mascota")




        }






    }
}
