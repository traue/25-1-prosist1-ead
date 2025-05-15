package br.mack.exercicio;

public class Gerente extends Funcionario {

    private String departamento;

    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Exibindo detalhes do gerente:");

        super.exibirDetalhes();
        System.out.println("Departamento do gerente: " + departamento);
    }
}
