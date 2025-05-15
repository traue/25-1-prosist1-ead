package br.mack;

public class Principal {

    public static void main(String[] args) {

        Carro c = new Carro();
        c.marca = "Fiat";
        c.numeroDePortas = 5;
        c.ligar();
        c.abrirPortaMalas();
        System.out.println("Este carro da " + c.marca + " tem " + c.numeroDePortas + " portas.");

        Moto m = new Moto();
        m.cilindradas = 1800;
        m.partidaEletrica();

    }

}
