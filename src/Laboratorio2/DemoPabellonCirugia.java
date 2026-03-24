package Laboratorio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoPabellonCirugia {

    private List<PabellonCirugia> listaPabellonCirugias = new ArrayList<>();

    public void procesa() {
        //Crear 6 pabellones
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.println("Pabellon " + (i + 1));

            int numero;
            do {
                System.out.print("Numero: ");
                numero = sc.nextInt();
            } while (numero <= 0);

            sc.nextLine();

            String especialidad;
            do {
                System.out.print("Especialidad: ");
                especialidad = sc.nextLine();
            } while (especialidad.trim().isEmpty());

            listaPabellonCirugias.add(new PabellonCirugia(numero, especialidad));
        }

        //posiciones pares ocupados
        for (int i = 0; i < listaPabellonCirugias.size(); i++) {
            if (i % 2 == 0) {
                listaPabellonCirugias.get(i).setEstado(Estado.OCUPADO);
            }
        }

        //mostrar lista
        System.out.println("\n--- Lista ---");
        for (int i = 0; i < listaPabellonCirugias.size(); i++) {
            System.out.println("Posición " + i + ": " + listaPabellonCirugias.get(i));
        }

        //iguales
        boolean hay = false;

        for (int i = 0; i < listaPabellonCirugias.size(); i++) {
            for (int j = i + 1; j < listaPabellonCirugias.size(); j++) {
                if (listaPabellonCirugias.get(i).equals(listaPabellonCirugias.get(j))) {
                    System.out.println("Iguales en las posiciones: " + i + " y " + j);
                    hay = true;
                }
            }
        }

        if (!hay) {
            System.out.println("No hay pabellones iguales");
        }

        sc.close();

    }

    public static void main(String[] args) {
        DemoPabellonCirugia objeto = new DemoPabellonCirugia();
        objeto.procesa();
    }
}




