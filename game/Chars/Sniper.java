package game.Chars;

import java.util.List;

import game.BaseHero;

public class Sniper extends BaseHero {
    public Sniper(List<BaseHero> side, int x, int y) {
        super(side);
        name = "Lixo";
        attack = 12;
        protection = 10;
        shots = 32;
        damage = new Vector2(-4, -4);
        health = 15;
        speed = 9;
        delivery = false;
        magic = false;
        status = "stand";
    }

    public String getInfo() {
        return String.format("the longest battle distance");
    }

    @Override
    public void step() {
  
    }

}
