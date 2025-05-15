package br.mack;

public class SuperHero {

    private String nome;
    private int nivelPoder;
    private int saude;

    public SuperHero() {
    }

    public SuperHero(String nome, int nivelPoder, int saude) {
        this.nome = nome;
        this.nivelPoder = nivelPoder;
        this.saude = saude;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivelPoder() {
        return nivelPoder;
    }

    public void setNivelPoder(int nivelPoder) {
        this.nivelPoder = nivelPoder;
    }

    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public void atacar() {
        System.out.println("Ataque padrão");
    }

    public void defender() {
        System.out.println(nome + " está se defendendo");
    }

    public void usarHabilidadeEspecial() {
        System.out.println("Usando habilidade especial");
    }
}
