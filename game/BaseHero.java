package game;

import java.util.List;
import game.Chars.Vector2;

public abstract class BaseHero implements Actions {

    public String name;
    protected int attack;
    protected int protection;
    protected int shots;
    protected Vector2 damage;
    public float health;
    public float crntHealth;
    protected int speed;
    protected boolean delivery;
    protected boolean magic;
    public String status;
    public Vector2 position;
    protected List<BaseHero> list;
    protected String state;
    



    protected List<BaseHero> getList() {return list;}

    public BaseHero(List<BaseHero> side) {list = side;}

    @Override
    public void step(List<BaseHero> side) {}



    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getAttack() {return attack;}
    public void setAttack(int attack) {this.attack = attack;}

    public int getProtection() {return protection;}
    public void setProtection(int protection) {this.protection = protection;}

    public int getShots() {return shots;}
    public void setShots(int shots) {this.shots = shots;}

    public Vector2 getDamage() {return damage;}
    public void setDamage(Vector2 damage) {this.damage = damage;}
    
    public float getHealth() {return health;}
    public void setHealth(int health) {this.health = health;}

    public int getSpeed() {return speed;}
    public void setSpeed(int speed) {this.speed = speed;}
    
    public boolean getDelivery() {return delivery;}
    public void setDelivery(Boolean delivery) {this.delivery = delivery;}

    public boolean getMagic() {return magic;}
    public void setMagic(Boolean magic) {this.magic = magic;}

    public String getStatus() {return status;}

    @Override
    public void setStatus() {
        if (!status.equals("Die")) {
            status = "stand";
            if (crntHealth < 0 ) {
                status = "Die";
                crntHealth = 0;
            }
            if (crntHealth > health) crntHealth = health;
        }}


    public Vector2 getPosition() {return position;}
    public void setPosition(Vector2 position) {this.position = position;}

    public String getState() {return state;}
    public void setState(String state) {this.state = state;}




    @Override
    public void hit() {}

    @Override
    public float getHit(float damage) {return 0;}

    @Override
    public boolean status() {return false;}

    @Override
    public Vector2 changePosition() {return position;}

    @Override
    public String returnCondtion() {
        return String.format(getName() + " Health: " + getHealth() + " State: "+getState());
    }
    
    // public Vector2 getDistance(List<BaseHero> side){
    //     float dist = Integer.MAX_VALUE;
    //     float out = 0;

    //     for (int i = 0; i < side.size(); i++) {
    //         float dX = side.get(i).position.x - position.x;
    //         float dY = side.get(i).position.y - position.y;
    //         float tD = (float) Math.sqrt(dX*dX + dY*dY);
    //         if (dist > tD && !side.get(i).status.equals("Die")) {
    //             out = i;
    //             dist = tD;
    //         }
    //     }
    //     return new Vector2(out, dist);
    // }
    

}
