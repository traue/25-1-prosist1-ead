package br.mack;

public class StrongHero extends  SuperHero {

    public StrongHero(String nome, int nivelPoder, int saude) {
        super(nome, nivelPoder, saude);
    }

    @Override
    public void atacar() {
        System.out.println(this.getNome() + " está realizando um ataque com força!");
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(this.getNome() + " está usando a habilidade especial: ficando mais forte ainda...");
    }
}
