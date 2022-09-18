package game.Chars;

import game.BaseHero;

public class Monk extends BaseHero {
    public Monk() {
        name = "Veron";
        attack = 12;
        protection = 7;
        shots = 0;
        damage[0] = -4; damage[1] = -4;
        health = 30;
        speed = 5;
        delivery = false;
        magic = true;
    }

    public Monk(int protection, int attack) {
        this.protection = protection;
        this.attack = attack;
    }

    public Monk(String name) {
        this.name = name;
    }

    public String getInfo() {
        return String.format("selfless support");
    }

}
 