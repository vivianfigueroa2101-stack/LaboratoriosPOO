package Laboratorio6;

public class Main {
    public static void main(String[] args) {

        RegistroDisquera departamentoMarketing = RegistroDisquera.getInstance();
        RegistroDisquera departamentoProduccion = RegistroDisquera.getInstance();

        departamentoMarketing.registrarArtista("Dua Lipa");
        departamentoMarketing.registrarArtista("The Weeknd");
        departamentoProduccion.registrarArtista("Rosalía");

        //mostrar artistas
        departamentoProduccion.mostrarArtistas();

        //verificar instancia
        System.out.println(departamentoMarketing == departamentoProduccion);
    }
}