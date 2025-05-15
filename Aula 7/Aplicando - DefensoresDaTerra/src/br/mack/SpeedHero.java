package br.mack;

public class SpeedHero extends SuperHero {

    public SpeedHero(String nome, int nivelPoder, int saude) {
        super(nome, nivelPoder, saude);
    }

    @Override
    public void atacar() {
        System.out.println(this.getNome() + " está realizando um ataque de super velocidade!");
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(this.getNome() + " está usando a habilidade especial: correndo mais que o flash...");
    }
}
