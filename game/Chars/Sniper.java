package game.Chars;

import game.BaseHero;

public class Sniper extends BaseHero {
    public Sniper() {
        name = "Lixo";
        attack = 12;
        protection = 10;
        shots = 32;
        damage[0] = 8; damage[1] = 10;
        health = 15;
        speed = 9;
        delivery = false;
        magic = false;
    }

    public Sniper(int protection, int attack) {
        this.protection = protection;
        this.attack = attack;
    }

    public Sniper(String name) {
        this.name = name;
    }

    public String getInfo() {
        return String.format("the longest battle distance");
    }

}
