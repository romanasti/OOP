package game.Chars;

import java.util.List;

import game.BaseHero;

public class Peasant extends BaseHero {
    public Peasant(List<BaseHero> side, int x, int y) {
        super(side);
        name = "Protol";
        attack = 1;
        protection = 1;
        shots = 0;
        damage = new Vector2(-4, -4);
        health = 1;
        speed = 3;
        delivery = true;
        magic = false;
        status = "stand";
    }

    public String getInfo() {
        return String.format("the most important thing that is in the village");
    }

    @Override
    public void step(List<BaseHero> side) {
  
    }
}
