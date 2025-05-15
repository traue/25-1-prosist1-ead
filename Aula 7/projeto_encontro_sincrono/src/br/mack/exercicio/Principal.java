package br.mack.exercicio;

public class Principal {

    public static void main(String[] args) {

        // não podemos instanciar classes abstradas
        //Funcionario f = new Funcionario();

        Gerente ger = new Gerente();
        Desenvolvedor dev = new Desenvolvedor();

        ger.setNome("Fulaninho");
        ger.setSalario(40000.50);
        ger.setDepartamento("Negócios");

        dev.setNome("Thomas");
        dev.setSalario(100000.90);
        dev.setLinguagemDeProgramacao("Java");

        ger.exibirDetalhes();
        dev.exibirDetalhes();
    }

}
