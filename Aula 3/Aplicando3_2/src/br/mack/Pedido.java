package br.mack;

public class Pedido {
    // Atributos
    int id;
    String nomeProduto;
    int quantidade;
    double precoUnitario;

    public double calcularTotal() {
        return quantidade * precoUnitario;
    }

    public void exibirDetalhes() {
        System.out.println("Peiddo #" + id);
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço Unitário: " + precoUnitario);
        System.out.println("Total: " + calcularTotal());
        System.out.println("=====================");
    }
}
