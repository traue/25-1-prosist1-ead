package br.mack;

import java.util.Scanner;
import java.lang.Math;

public class Ex1 { //na hora de enviar, o nome da classe deve ser "Main"

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opc;

        while (true) {
            opc = sc.nextInt();
            if (opc == 6) {
                break;
            }
            if (opc < 1 || opc > 6) {
                System.out.println("OPÇÃO INVÁLIDA");
            }

            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();

            switch (opc) {
                case 1:
                    System.out.println("Potência = " + Math.pow(n1, n2));
                    break;
                case 2:
                    System.out.println("Raiz Quadrada de " + n1 + " = " + Math.sqrt(n1));
                    System.out.println("Raiz Quadrada de " + n2 + " = " + Math.sqrt(n2));
                    break;
                case 3:
                    System.out.println("Máximo = " + Math.max(n1, n2));
                    break;
                case 4:
                    System.out.println("Mínimo = " + Math.min(n1, n2));
                    break;
                case 5:
                    System.out.println("Média Geométrica = " + Math.sqrt(n1 * n2));
                    break;
            }
        }
        sc.close();
    }
}
