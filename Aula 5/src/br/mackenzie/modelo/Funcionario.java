package br.mackenzie.modelo;

public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    protected double calcularBonus() {
        return salario * 0.1;
    }

    void exibirDetalhes() {
        System.out.println("Nome: " + nome + "\nSalario: " + salario);
    }
}
