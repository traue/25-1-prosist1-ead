package classes.curso;

import classes.aluno.Aluno;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nome;
    private String codigo;
    private List<Aluno> alunos; // Agregaçao

    public Curso() {
        alunos = new ArrayList<>();
    }

    public Curso(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
        alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", codigo='" + codigo + '\'' +
                ", alunos=" + alunos +
                '}';
    }
}
