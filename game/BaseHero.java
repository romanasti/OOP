package game;

public class BaseHero implements Actions {

    protected String name;
    protected int attack;
    protected int protection;
    protected int shots;
    protected int[] damage = new int[2];
    protected int health;
    protected int speed;
    protected boolean delivery;
    protected boolean magic = true;


    public BaseHero() {}


    public String getName() {
        return name;
    }
    public int getAttack() {
        return attack;
    }
    public int getProtection() {
        return protection;
    }
    public int getShots() {
        return shots;
    }
    public int getDamage(int damage) {
        return damage;
    }
    public int getHealth() {
        return health;
    }
    public int getSpeed() {
        return speed;
    }
    public boolean getDelivery() {
        return delivery;
    }
    public boolean getMagic() {
        return magic;
    }




    @Override
    public float hit() {
        // 
        return 0;
    }

    @Override
    public float getHit(float damage) {
        // 
        return 0;
    }

    @Override
    public boolean status() {
        // 
        return false;
    }

    @Override
    public boolean changePosition() {
        // 
        return false;
    }

    @Override
    public String returnCondtion() {
        // 
        return null;
    }
    
}
