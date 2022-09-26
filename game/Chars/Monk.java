package game.Chars;

import java.util.List;
import java.util.Random;

import game.BaseHero;

public class Monk extends BaseHero {
    public Monk(List<BaseHero> side, int x, int y) {
        super(side);
        name = "Veron";
        attack = 12;
        protection = 7;
        shots = 0;
        damage = new Vector2(-4, -4);
        crntHealth = health = 30;
        speed = 5;
        delivery = false;
        magic = true;
        status = "stand";
        position = new Vector2(x, y);
    }

    public String getInfo() {
        return String.format("selfless support");
    }

    @Override
    public void step(List<BaseHero> side) {
        Random rnd = new Random();
        list.get(rnd.nextInt(list.size())).health -= damage.x;
        // лечит одного случайного героя из своей команды(включая себя)

    }

}
