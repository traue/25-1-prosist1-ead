package br.mack;

public class Aluno {

    private String nome;
    private String matricula;
    private int idade;

    public Aluno(String nome, String matricula, int idade) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
    }

    public void exibirDados() {
        System.out.println(" - Nome: " + nome);
        System.out.println(" - Matricula: " + matricula);
        System.out.println(" - Idade: " + idade);
    }

    public String getMatricula() {
        return matricula;
    }


}
