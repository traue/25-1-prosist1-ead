package br.mack.exercicio;

public class Desenvolvedor extends Funcionario{

    private String linguagemDeProgramacao;

    public String getLinguagemDeProgramacao() {
        return linguagemDeProgramacao;
    }
    public void setLinguagemDeProgramacao(String linguagemDeProgramacao) {
        this.linguagemDeProgramacao = linguagemDeProgramacao;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Exibindo detalhes do desenvolvedor:");
        super.exibirDetalhes();
        System.out.println("Este DEV trabalha com " + linguagemDeProgramacao);
    }
}
