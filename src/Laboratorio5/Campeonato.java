package Laboratorio5;

import java.util.ArrayList;

public class Campeonato {
    public static void main(String[] args) {
        ArrayList<CocheDeCarreras> listaCoches = new ArrayList<>();

        //Instanciar y añadir dos PrototipoLM y dos GranTurismo
        listaCoches.add (new PrototipoLM ("Toyota" , "LM" , 123 , true));
        listaCoches.add (new PrototipoLM ("Hyundai" , "LM" , 12 , true));
        listaCoches.add (new GranTurismo ("Toyota" , "GT" , 1 , 1));
        listaCoches.add (new GranTurismo ("Hyundai" , "GT" , 13 , 0));

        //Utilice un bucle para recorrer la lista, invocando mostrarDatos() y competir()
        for (CocheDeCarreras coche : listaCoches){
            coche.mostrarDatos();
            coche.competir();
        }
    }
}
