package game.Chars;

import game.BaseHero;

public class Spearman extends BaseHero {
    public Spearman() {
        name = "Nolen";
        attack = 4;
        protection = 5;
        shots = 0;
        damage[0] = 1; damage[1] = 3;
        health = 10;
        speed = 4;
        delivery = false;
        magic = false;
    }

    public Spearman(int protection, int attack) {
        this.protection = protection;
        this.attack = attack;
    }

    public Spearman(String name) {
        this.name = name;
    }

    public String getInfo() {
        return String.format("takes the damage on himself");
    }

}
