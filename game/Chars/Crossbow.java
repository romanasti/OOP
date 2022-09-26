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
        position = new Vector2(x, y);
    }

    public String getInfo() {
        return String.format("great damage in long-range combat");
    }

    public boolean status() {
        return status.equals("active");
    }

    // @Override
    // public void step(List<BaseHero> side) {
    //     boolean tmp = false;
    //     for (BaseHero bh : super.list) {
    //         if (bh.name.equals("Peasant") && bh.name.equals("stand")) {
    //             tmp = true;
    //             bh.name = "busy";
    //             break;
    //         }
    //     }
    //     Vector2 target = super.getDistance(side);
    //     float dd = (damage.x + damage.y) / 2;
    //     int d = (int) Math.round(dd + (dd / 10) * (5 - target.y));
    //     side.get((int) target.x).crntHealth -= d;
    //     if (!tmp)
    //         shots--;
    // }

}
