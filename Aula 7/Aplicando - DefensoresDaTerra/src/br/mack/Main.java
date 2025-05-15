package br.mack;

public class Main {
    public static void main(String[] args) {

        SpeedHero speedHero = new SpeedHero("MackFlash", 100, 90);
        FlyingHero flyingHero = new FlyingHero("MackFlyer", 80, 100);
        StrongHero strongHero = new StrongHero("MackStrong", 200, 40);

        speedHero.atacar();
        speedHero.usarHabilidadeEspecial();
        speedHero.defender();

        flyingHero.atacar();
        flyingHero.defender();
        flyingHero.usarHabilidadeEspecial();

        strongHero.usarHabilidadeEspecial();
        strongHero.defender();
        strongHero.atacar();
    }
}
