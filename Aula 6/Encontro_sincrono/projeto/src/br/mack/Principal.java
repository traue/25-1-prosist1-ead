package br.mack;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Escola escola = new Escola("Escola Mack", "Rua da Consolação, 930");
        List<Aluno> alunos = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\n---- MENU DA ESCOLA ----");
            System.out.println("1. Criar aluno");
            System.out.println("2. Criar sala");
            System.out.println("3. Adicionar aluno à sala");
            System.out.println("4. Remover aluno da sala");
            System.out.println("5. Exibir dados da escola");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Matrícula: ");
                    String matricula = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    alunos.add(new Aluno(nome, matricula, idade));
                    System.out.println("Aluno cadastrado.");
                }
                case 2 -> {
                    System.out.print("Número da sala: ");
                    String numero = scanner.nextLine();
                    Sala sala = new Sala(numero);
                    escola.adicionarSala(sala);
                    System.out.println("Sala criada.");
                }
                case 3 -> {
                    System.out.print("Matrícula do aluno: ");
                    String matricula = scanner.nextLine();
                    System.out.print("Número da sala: ");
                    String numeroSala = scanner.nextLine();

                    Sala sala = escola.buscarSala(numeroSala);
                    Aluno aluno = buscarAlunoPorMatricula(alunos, matricula);

                    if (sala != null && aluno != null) {
                        sala.adicionarAluno(aluno);
                        System.out.println("Aluno adicionado à sala.");
                    } else {
                        System.out.println("Aluno ou sala não encontrados.");
                    }
                }
                case 4 -> {
                    System.out.print("Número da sala: ");
                    String numero = scanner.nextLine();
                    System.out.print("Matrícula do aluno: ");
                    String matricula = scanner.nextLine();

                    Sala sala = escola.buscarSala(numero);
                    if (sala != null) {
                        sala.removerAlunoPorMatricula(matricula);
                    } else {
                        System.out.println("Sala não encontrada.");
                    }
                }
                case 5 -> escola.exibirDadosEscola();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }

    private static Aluno buscarAlunoPorMatricula(List<Aluno> alunos, String matricula) {
        for (Aluno a : alunos) {
            if (a.getMatricula().equals(matricula)) {
                return a;
            }
        }
        return null;
    }
}