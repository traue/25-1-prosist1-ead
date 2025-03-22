package br.mack;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        int idade = 38;
        float salario = 10000.50f;
        boolean fumante = false;
        char sexo = 'M';
        String nome = "Renata";

        ArrayList<Float> notas = new ArrayList<>();

        notas.add(6.8f);
        notas.add(7.5f);
        notas.add(8.5f);
        notas.add(10f);
        notas.add(6f);

        System.out.println("Notas: " + notas);
        //System.out.println("Nota do terceiro aluno: " + notas.get(2));

        for (int i = 0; i < notas.size(); i++) {
            System.out.printf("Nota %d: R$ %.2f\n", i, notas.get(i));
        }

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();


//        a1.nome = "Renata";
//        a1.ra = 1234;
//        a1.curso = "ADS";
//
//        a2.nome = "Francisco";
//        a2.ra = 4321;
//        a2.curso = "Jogos Digitais";
        //com encapsulamento:
        a1.setNome("Renata");
        a2.setNome("Francisco");
        a1.setRa(12345);
        a1.setCurso("ADS");
        //..

    }
}
