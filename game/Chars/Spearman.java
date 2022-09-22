package game.Chars;

import java.util.List;

import game.BaseHero;

public class Spearman extends BaseHero {
    public Spearman(List<BaseHero> side, int x, int y) {
        super(side);
        name = "Nolen";
        attack = 4;
        protection = 5;
        shots = 0;
        damage = new Vector2(-4, -4);
        health = 10;
        speed = 4;
        delivery = false;
        magic = false;
        status = "stand";
    }

    public String getInfo() {
        return String.format("takes the damage on himself");
    }

    @Override
    public void step() {
    
    }

}
