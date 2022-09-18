package game.Chars;

import game.BaseHero;

public class Outlaw extends BaseHero {
    public Outlaw() {
        name = "Vastik";
        attack = 17;
        protection = 12;
        shots = 0;
        damage[0] = -5; damage[1] = -5;
        health = 30;
        speed = 9;
        delivery = false;
        magic = true;
    }

    public Outlaw(int protection, int attack) {
        this.protection = protection;
        this.attack = attack;
    }

    public Outlaw(String name) {
        this.name = name;
    }

    public String getInfo() {
        return String.format("the most damage in close combat");
    }

}
