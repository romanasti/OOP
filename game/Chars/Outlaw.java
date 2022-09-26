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
        position = new Vector2(x, y);
    }

    public String getInfo() {
        return String.format("the most damage in close combat");
    }

    // @Override
    // public void step(List<BaseHero> side) {
    //     Vector2 target = super.getDistance(side);
    //     if (target.y > 1.5) {
    //         if (side.get((int) target.x).position.x > position.x)
    //             position.x++;
    //         else if (side.get((int) target.x).position.x < position.x)
    //             position.x--;
    //         else if (side.get((int) target.x).position.y > position.y)
    //             position.y++;
    //         else if (side.get((int) target.x).position.y < position.y)
    //             position.y--;
    //     } else {
    //         float dd = (damage.x + damage.y) / 2;
    //         int d = (int) Math.round(dd + (dd / 10) * (5 - target.y));
    //         side.get((int) target.x).crntHealth -= d;
    //     }
    // }

}
