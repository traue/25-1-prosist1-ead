package classes;

import classes.aluno.Aluno;
import classes.curso.Curso;
import classes.departamento.Departamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criação de dois objetos do tipo aluno
        System.out.print("Digite o nome do primeiro aluno: ");
        String nomeAluno = sc.nextLine();
        System.out.print("Digite o matrícula do primeoro aluno: ");
        String matricula = sc.nextLine();
        Aluno aluno = new Aluno(nomeAluno, matricula);

        System.out.print("Digite o nome do segundo aluno: ");
        String nomeAluno2 = sc.nextLine();
        System.out.print("Digite o matrícula do segundo aluno: ");
        String matricula2 = sc.nextLine();
        Aluno aluno2 = new Aluno(nomeAluno2, matricula2);

        // Criação de um objeto curso
        System.out.print("Nome do curso: ");
        String nomeCurso = sc.nextLine();
        System.out.print("Código do Curso: ");
        String codigoCurso = sc.nextLine();
        Curso curso = new Curso(nomeCurso, codigoCurso);
        // agregação
        curso.addAluno(aluno);
        curso.addAluno(aluno2);

        // Criação do departamento
        System.out.print("Nome do departamento: ");
        String nomeDepartamento = sc.nextLine();
        Departamento departamento = new Departamento(nomeDepartamento, curso);

        // exibição das informações:
        System.out.println("Informações:");
        System.out.println(departamento.toString());

        sc.close();
    }
}
