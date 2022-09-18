package game.Chars;

import game.BaseHero;

public class Crossbow extends BaseHero {
    public Crossbow() {
        name = "Taurus";
        attack = 6;
        protection = 3;
        shots = 16;
        damage[0] = 2; damage[1] = 3;
        health = 10;
        speed = 4;
        delivery = false;
        magic = false;
    }

    public Crossbow(int protection, int attack) {
        this.protection = protection;
        this.attack = attack;
    }

    public Crossbow(String name) {
        this.name = name;
    }

    public String getInfo() {
        return String.format("great damage in long-range combat");
    }

}
