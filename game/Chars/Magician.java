package game.Chars;

import java.util.List;

import game.BaseHero;

public class Magician extends BaseHero {
    public Magician(List<BaseHero> side, int x, int y) {
        super(side);
        name = "Ezios";
        attack = 17;
        protection = 12;
        shots = 0;
        damage = new Vector2(-4, -4);
        health = 30;
        speed = 9;
        delivery = false;
        magic = true;
        status = "stand";
    }

    public String getInfo() {
        return String.format("strongest magic class");
    }

    @Override
    public void step() {
   
    }

}