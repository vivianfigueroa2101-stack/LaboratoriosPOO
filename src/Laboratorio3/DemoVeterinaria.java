package Laboratorio3;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

public class DemoVeterinaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Almacenamiento
        ArrayList<PacienteMascota> listaPacientes = new ArrayList<>();

        //obtenemos fechas
        int anioActual = LocalDate.now().getYear();
        LocalDate fechaCANINOS = LocalDate.of(anioActual, Month.APRIL, 15);
        LocalDate fechaFELINOS = LocalDate.of(anioActual, Month.MAY, 10);
        LocalDate fechaEXOTICOS = LocalDate.of(anioActual, Month.JUNE, 5);

        LocalDate[] fechas = {fechaCANINOS, fechaFELINOS, fechaEXOTICOS};
        Especie[]especies = Especie.values();

        System.out.println("--- Registro de Nuevos Pacientes ---");

        for (int i = 0; i < especies.length; i++) {

            System.out.println("\nIngrese los datos para la especie de " + especies[i] + ":");

            System.out.println("Ingrese nombre de la mascota");
            String nombreMascota = scanner.next();

            System.out.println("Ingrese peso ideal de la mascota");
            int pesoIdeal = scanner.nextInt();

            System.out.println("Ingrese nombre dueño de la mascota");
            String nombreDueño = scanner.next();

            //Creamos paciente
            listaPacientes.add(new PacienteMascota(nombreMascota, especies[i] , pesoIdeal, nombreDueño, fechas[i]));
        }

        boolean salir = false;
        while (!salir) {
            System.out.println("\n======= MENÚ PRINCIPAL =======");
            System.out.println("1. Listar pacientes");
            System.out.println("2. Días para la vacuna");
            System.out.println("3. Actualizar nombre();");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();


            //Menú de opciones
            switch (opcion) {
                case 1:
                    System.out.println("\n--- Lista de pacientes ---");
                    ListarMascotas(listaPacientes);
                    break;
                case 2:
                    System.out.println("\n--- Días para vacuna ---");
                    for (PacienteMascota i : listaPacientes) {
                        System.out.println("Faltan " + i.DiasParaVacuna() + " días para: " + i.getNombreMascota());
                    }
                    break;

                case 3:
                    System.out.println("\n--- Actualizar nombre de la red ---");
                    PacienteMascota.ActualizarNombreRed("Letirinaria");
                    System.out.println("Nombre actualizado a: Letirinaria");
                    break;

                case 4:
                    salir = true;
                    System.out.println("\nCerrando el sistema...");
                    break;

                default:
                    System.out.println("\nOpción inválida. Intente de nuevo.");
            }
        }
        scanner.close();
    }

    public static void ListarMascotas(ArrayList<PacienteMascota> mascotas) {
        if (mascotas.isEmpty()) {
            System.out.println("No hay mascotas registradas.");
            return;
        }
        for (PacienteMascota i : mascotas) {
            System.out.println(i.toString());
        }
    }
}
