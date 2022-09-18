package game.Chars;

import game.BaseHero;

public class Magician extends BaseHero {

    public Magician() {
        name = "Ezios";
        attack = 17;
        protection = 12;
        shots = 0;
        damage[0] = -5; damage[1] = -5;
        health = 30;
        speed = 9;
        delivery = false;
        magic = true;
    }
    
    public Magician(int protection, int attack) {
        this.protection = protection;
        this.attack = attack;
    }

    public Magician(String name) {
        this.name = name;
    }

    public String getInfo() {
        return String.format("strongest magic class");
    }

}