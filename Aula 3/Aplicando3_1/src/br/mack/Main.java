package br.mack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Celular c = new Celular();
        c.modelo = input.next();
        c.marca = input.next();
        c.imei = input.nextLong();
        c.numero = input.next();
        c.cor = input.next();
        c.anoFabricacao = input.nextInt();

        System.out.print(fichaTecnica(c) + "\n" + "Imei: " + ((c.checaImei(input.nextLong()))? "válido" : "inválido"));
        input.close();
    }

    static String fichaTecnica(Celular c) {
        return "Modelo: " + c.modelo + "\n" +
                "Marca: " + c.marca + "\n" +
                "Imei: " + c.imei + "\n" +
                "Número: " + c.exibeNumeroFormatado() + "\n" +
                "Cor: " + c.cor + "\n" +
                "Ano de Fabricação: " + c.anoFabricacao + "\n" +
                "Garantia: " + c.verificaGarantia();

    }
}