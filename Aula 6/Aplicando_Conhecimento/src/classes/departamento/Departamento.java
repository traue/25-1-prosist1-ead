package classes.departamento;

import classes.curso.Curso;

public class Departamento {
    private String nome;
    private Curso curso;

    public Departamento() {
    }

    public Departamento(String nome, Curso curso) {
        this.nome = nome;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nome='" + nome + '\'' +
                ", curso=" + curso +
                '}';
    }
}
