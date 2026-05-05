package Laboratorio6;

import java.util.ArrayList;
import java.util.List;

public class RegistroDisquera {

    private static RegistroDisquera instancia;

    //lista de artistas
    private List<String> artistas;

    //constructor
    private RegistroDisquera() {
        artistas = new ArrayList<>();
    }

    public static RegistroDisquera getInstance() {
        if (instancia == null) {
            instancia = new RegistroDisquera();
        }
        return instancia;
    }

    //agrega artistas
    public void registrarArtista(String nombre) {
        artistas.add(nombre);
    }

    //muestra artistas
    public void mostrarArtistas() {
        System.out.println("Artistas registrados:");
        for (String artista : artistas) {
            System.out.println(artista);
        }
    }
}