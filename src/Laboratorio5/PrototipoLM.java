package Laboratorio5;


public class PrototipoLM extends CocheDeCarreras {
    boolean sistemaHibrido ;

    public PrototipoLM(String marca, String modelo, int velocidadMaxima, boolean sistemaHibrido) {
        super(marca, modelo, velocidadMaxima);
        this.sistemaHibrido = sistemaHibrido;
    }

    @Override
   //sobreescribir competir
    public void competir () {
        //usa hibrido o de combustión?
        if (sistemaHibrido == true) {
            System.out.println("Sistema hibrido");
            System.out.println("------------------");
        }  else {
            System.out.println("Sistema de combustión");
            System.out.println("------------------");
        }
    }







}
