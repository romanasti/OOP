package game;

public interface Actions {
    float hit();
    float getHit(float damage);
    boolean status();
    boolean changePosition();
    String returnCondtion();
}
