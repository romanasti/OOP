package game.Chars;

import game.BaseHero;

public class Peasant extends BaseHero {
    public Peasant() {
        name = "Protol";
        attack = 1;
        protection = 1;
        shots = 0;
        damage[0] = 1; damage[1] = 1;
        health = 1;
        speed = 3;
        delivery = true;
        magic = false;
    }

    public Peasant(int protection, int attack) {
        this.protection = protection;
        this.attack = attack;
    }

    public Peasant(String name) {
        this.name = name;
    }

    public String getInfo() {
        return String.format("the most important thing that is in the village");
    }
}
