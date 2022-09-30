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
        crntHealth = health = 30;
        speed = 9;
        delivery = false;
        magic = true;
        status = "stand";
        position = new Vector2(x, y);
    }

    public String getInfo() {
        return String.format("strongest magic class");
    }

    @Override
    public void step(List<BaseHero> side) {
        int min = 0;
        BaseHero p = super.list.get(0);
        for (BaseHero i : super.list) {if (i.health - i.crntHealth > min && !p.status.equals("Die")) {min = 0; p=i;}}
        p.crntHealth -= damage.x;
    }

}