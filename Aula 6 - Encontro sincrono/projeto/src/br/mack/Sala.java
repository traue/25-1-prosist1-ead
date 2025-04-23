package br.mack;

import java.util.ArrayList;
import java.util.List;

public class Sala {

    private String identificacao;
    private List<Aluno> alunos;

    public Sala(String identificacao) {
        this.identificacao = identificacao;
        alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void exibirAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(" --- ");
            aluno.exibirDados();
        }
    }

    public void removerAlunoPorMatricula(String matricula) {
        Aluno removido = null;
        for (Aluno a : alunos) {
            if (a.getMatricula().equals(matricula)) {
                removido = a;
                break;
            }
        }
        if (removido != null) {
            alunos.remove(removido);
            System.out.println("Aluno removido com sucesso.");
        } else {
            System.out.println("Aluno não encontrado na sala.");
        }
    }

    public String getIdentificacao() {
        return identificacao;
    }
}
