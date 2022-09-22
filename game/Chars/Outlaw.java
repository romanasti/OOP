package game.Chars;

import java.util.List;

import game.BaseHero;

public class Outlaw extends BaseHero {
    public Outlaw(List<BaseHero> side, int x, int y) {
        super(side);
        name = "Vastik";
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
        return String.format("the most damage in close combat");
    }
    
    @Override
    public void step() {
    
    }

}
