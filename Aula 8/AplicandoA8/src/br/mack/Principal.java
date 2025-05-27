package br.mack;

public class Principal {

    public static void main(String[] args) {
        Curso c = new Curso();

        c.getMinhasDisciplinas()[0].nome = "Programação de Sistemas I";
        c.getMinhasDisciplinas()[1].nome = "Python";

        System.out.println(c.getMinhasDisciplinas()[0].nome);
        System.out.println(c.getMinhasDisciplinas()[1].nome);


        //-------------
        System.out.println("-------------------------");

        Produto[] estoque = new Produto[2];

        Produto p1 = new Produto("Caneta");
        Produto p2 = p1;
        p2.nome = "Lápis";

        estoque[0] = p1;
        estoque[1] = p2;

        System.out.println(estoque[0].nome + " e " + estoque[1].nome);

        //-----------------------
        System.out.println("---------------------------");


        Conta[] minhasContas = new Conta[10];
        minhasContas[0] = new ContaCorrente();
        minhasContas[1] = new ContaPoupanca();


    }




}
