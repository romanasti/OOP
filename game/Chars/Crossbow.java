package game.Chars;

import java.util.List;

import game.BaseHero;

public class Crossbow extends BaseHero {
    public Crossbow(List<BaseHero> side, int x, int y) {
        super(side);
        name = "Taurus";
        attack = 6;
        protection = 3;
        shots = 16;
        damage = new Vector2(-4, -4);
        health = 10;
        speed = 4;
        delivery = false;
        magic = false;
        status = "stand";
    }

    public String getInfo() {
        return String.format("great damage in long-range combat");
    }

    @Override
    public void step() {

    }



}
