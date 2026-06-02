import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // FECHA ACTUAL
        LocalDate fecha = LocalDate.now();
        String fechaTexto = String.format("%02d_%02d_%d",
                fecha.getDayOfMonth(),
                fecha.getMonthValue(),
                fecha.getYear());

        String archivoIngreso = "Ingreso_Empleados_Fecha_" + fechaTexto + ".txt";
        String archivoSalida = "Salida_Empleados_Fecha_" + fechaTexto + ".txt";

        // CONSTANTES DE HORARIO
        LocalTime limiteIngreso = LocalTime.of(8, 30);
        LocalTime limiteSalida = LocalTime.of(17, 0);

        // =========================
        // REGISTRO DE INGRESO
        // =========================
        System.out.println("=== REGISTRO INGRESO ===");

        System.out.print("Rut: ");
        String rut = sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Hora ingreso (HH:mm): ");
        LocalTime horaIngreso = LocalTime.parse(sc.nextLine());

        String lineaIngreso = rut + " | " + nombre + " | " + horaIngreso;

        // VALIDACIÓN ATRASO
        if (horaIngreso.isAfter(limiteIngreso)) {
            lineaIngreso += " | ATRASO";
        }

        // ESCRIBIR ARCHIVO INGRESO
        try (FileWriter fw = new FileWriter(archivoIngreso, true)) {
            fw.write(lineaIngreso + "\n");
        } catch (IOException e) {
            System.out.println("Error al escribir archivo de ingreso");
        }

        // =========================
        // REGISTRO DE SALIDA
        // =========================
        System.out.println("=== REGISTRO SALIDA ===");

        System.out.print("Hora salida (HH:mm): ");
        LocalTime horaSalida = LocalTime.parse(sc.nextLine());

        String lineaSalida = rut + " | " + nombre + " | " + horaSalida;

        // VALIDACIÓN HORAS EXTRA
        if (horaSalida.isAfter(limiteSalida)) {

            Duration extra = Duration.between(limiteSalida, horaSalida);

            long horas = extra.toHours();
            long minutos = extra.toMinutes() % 60;

            lineaSalida += " | TIEMPO EXTRA: " + horas + "h " + minutos + "m";
        }

        // ESCRIBIR ARCHIVO SALIDA
        try (FileWriter fw = new FileWriter(archivoSalida, true)) {
            fw.write(lineaSalida + "\n");
        } catch (IOException e) {
            System.out.println("Error al escribir archivo de salida");
        }

        System.out.println("Registros guardados correctamente.");
    }
}