package br.mack;

import java.util.Scanner;

public class Ex2 { //Na hora de submter é preciso renomear para "Main"
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("Numero negativo nao possui fatorial definido");
        } else if (numero == 0) {
            System.out.println("Fatorial de 0: 0! = 1");
        } else {
            long fatorial = 1;
            StringBuilder sequencia = new StringBuilder();
            for (int i = numero; i >= 1; i--) {
                fatorial *= i;
                sequencia.append(i);
                if (i > 1) {
                    sequencia.append(" x ");
                }
            }
            System.out.println("Fatorial de " + numero + ": " + numero + "! = " + sequencia + " = " + fatorial);
        }
        sc.close();
    }
}
