package br.mack;

public class FlyingHero extends SuperHero {

    public FlyingHero(String nome, int nivelPoder, int saude) {
        super(nome, nivelPoder, saude);
    }

    @Override
    public void atacar() {
        System.out.println(this.getNome() + " está realizando um ataque aéreo!");
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(this.getNome() + " está usando a habilidade especial: voando...");
    }
}

