package Laboratorio4;

public class Main {
    public static void main(String[] args) {
        //crear perro
        Perro perro = new Perro("Luna", 10, "Yorkshire");

        //crear gato
        Gato gato = new Gato("Alice", 1, true);

        //mostrar info
        System.out.println("--- PERRO ---");
        perro.mostrarInfo();
        perro.hacerSonido();

        System.out.println("\n--- GATO ---");
        gato.mostrarInfo();
        gato.hacerSonido();
    }
}
