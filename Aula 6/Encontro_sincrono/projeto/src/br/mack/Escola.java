package br.mack;

import java.util.ArrayList;
import java.util.List;

public class Escola {

    private String nome;
    private String endereco;
    private List<Sala> salas;

    public Escola(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;

        salas = new ArrayList<>();
        salas.add(new Sala("101A"));
        salas.add(new Sala("102B"));
    }

    public void adicionarSala(Sala sala) {
        salas.add(sala);
    }

    public Sala buscarSala(String identificacao) {
        for (Sala s : salas) {
            if (s.getIdentificacao().equals(identificacao)) {
                return s;
            }
        }
        return null;
    }

    public void exibirDadosEscola() {
        System.out.printf("Escola: " + nome);
        System.out.printf("\nEndereco: " + endereco);
        System.out.println("\nSalas da escola:");
        for (Sala sala : salas) {
            System.out.println(" Sala: " + sala.getIdentificacao() + ", alunos: ");
            sala.exibirAlunos();
        }
    }

}
