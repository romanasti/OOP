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
        health = 30;
        speed = 5;
        delivery = false;
        magic = true;
        status = "stand";
    }

    public String getInfo() {
        return String.format("selfless support");
    }

    @Override
    public void step() {
        Random rnd = new Random();
        list.get(rnd.nextInt(list.size())).health -= damage.x;
        //    int i = new Random().nextInt(super.list.size());
        // BaseHero p = super.list.get(i);
        // if (!p.status.equals("Die.")){
        //     super.list.get(i).crntHealth -= damage.x;
        //     if (super.list.get(i).crntHealth >= super.list.get(i).health) {
        //         super.list.get(i).crntHealth = super.list.get(i).health;
        //     }
        // }
    }

}
 