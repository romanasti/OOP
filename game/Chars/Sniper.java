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
