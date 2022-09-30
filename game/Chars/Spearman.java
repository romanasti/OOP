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
        damage = new Vector2(2, 3);
        crntHealth = health = 10;
        speed = 4;
        delivery = false;
        magic = false;
        status = "stand";
        position = new Vector2(x, y);
    }

    public String getInfo() {
        return String.format("takes the damage on himself");
    }

    // @Override
    public void step(List<BaseHero> side) {
        if (status.equals("Die"))
            return;
        Vector2 target = super.getDistance(side);
        if (target.y > 1) {
            if (side.get((int) target.x).position.y > position.y)
                position.y++;
            else if (side.get((int) target.x).position.y < position.y)
                position.y--;
            else if (side.get((int) target.x).position.x > position.x)
                position.x++;
            else if (side.get((int) target.x).position.x < position.x)
                position.x--;
        } else {
            float dd = (damage.x + damage.y) / 2;
            int d = (int) Math.round(dd + (dd / 10) * (5 - target.y));
            side.get((int) target.x).crntHealth -= d;
        }
    }
}
