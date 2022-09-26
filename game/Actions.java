package game;

import java.util.List;

import game.Chars.Vector2;

public interface Actions {
    void hit();
    float getHit(float damage);
    boolean status();
    Vector2 changePosition();
    String returnCondtion();
    void step(List<BaseHero> side);
    void setStatus();
}
