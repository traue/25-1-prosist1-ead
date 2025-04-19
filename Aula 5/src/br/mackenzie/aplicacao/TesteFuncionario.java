package br.mackenzie.aplicacao;

import br.mackenzie.modelo.Funcionario;

public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("", 0);

        funcionario.setNome("Chapolim Colorado");
        funcionario.setSalario(5000);

        // operação não permitida por conta do encapsulamento, ou seja
        // o atributo é privato e, portanto, somente o próprio obj
        // possui acesso
        //funcionario.nome = "Fulaninho";

        // não funcionou pois o método é protegido, ou seja,
        // só pode ser acessado em classes do mesmo pacote
        // ou classes derivadas
        //System.out.println("Bônus: " + funcionario.calculaBonus());

        // assim como o protected, somente poderíamos acessar se essa
        // classe estivesse no mesmo pacote
        //funcionario.exibirDetalhes();

    }

}
