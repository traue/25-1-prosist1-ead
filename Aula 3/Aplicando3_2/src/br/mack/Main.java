package br.mack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int qtdPedidos = sc.nextByte();

        List<Pedido> pedidos = new ArrayList<Pedido>();
        double totalGeral = 0;

        for (int i = 0; i < qtdPedidos; i++) {
            int id = sc.nextByte();
            sc.nextLine();

            String nomeProduto = sc.nextLine();
            int quantidade = sc.nextInt();
            sc.nextLine();
            double precoUnitario = sc.nextDouble();
            sc.nextLine();

            Pedido pedido = new Pedido();
            pedido.id =  id;
            pedido.nomeProduto = nomeProduto;
            pedido.precoUnitario = precoUnitario;
            pedido.quantidade = quantidade;

            pedidos.add(pedido);
        }

        System.out.println("Rsumo dos Pedidos:");

        for (Pedido pedido : pedidos) {
            pedido.exibirDetalhes();
            totalGeral += pedido.calcularTotal();
        }
        System.out.println("Total Geral: " + totalGeral);
        sc.close();
    }
}
