package br.mack;

public class Curso {

    Disciplina[] minhasDisciplinas = new Disciplina[10];


    public Curso() {
        for (int i = 0; i < minhasDisciplinas.length; i++) {
            minhasDisciplinas[i] = new Disciplina();
        }
    }

    public Disciplina[] getMinhasDisciplinas() {
        return minhasDisciplinas;
    }

    public void setMinhasDisciplinas(Disciplina[] minhasDisciplinas) {
        this.minhasDisciplinas = minhasDisciplinas;
    }
}
