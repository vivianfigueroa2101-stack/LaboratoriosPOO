package Lab7;

import java.util.ArrayList;

    public class Main {

        public static void main(String[] args) {

            ArrayList<Sismo> listaSismos = new ArrayList<>();

            try {

                // SISMO CORRECTO
                Sismo s1 = new Sismo(
                        "Ñuble",
                        "Chillán",
                        8.5f
                );

                listaSismos.add(s1);

                // SISMO INCORRECTO
                // ERROR: región vacía
                Sismo s2 = new Sismo(
                        "",
                        "Concepción",
                        6.7f
                );

                listaSismos.add(s2);

            } catch (SismoInvalidoException e) {

                System.out.println("Error al registrar sismo:");
                System.out.println(e.getMessage());

            }

            // MOSTRAR SISMOS REGISTRADOS
            System.out.println("\nLista de sismos:");

            for (Sismo s : listaSismos) {
                System.out.println(s);
            }
        }
}
