package Laboratorio5;

public class GranTurismo extends CocheDeCarreras
{
    int pesoExtraLastre ;

    public GranTurismo(String marca, String modelo, int velocidadMaxima, int pesoExtraLastre) {
        super(marca, modelo, velocidadMaxima);
        this.pesoExtraLastre = pesoExtraLastre;
    }

    public void competir () {
        if (pesoExtraLastre <= 0) {
            System.out.println("no tiene peso extra lastre");
            System.out.println("------------------");
        } else  {
            System.out.println("peso extra lastre:  " + pesoExtraLastre);
            System.out.println("------------------");
        }
    }
}
