package cars.type;

public class Engine {
    private final float volume;
    private final float power;
    private final int cylinders;
    

    public Engine(float volume, float power, int cylinders) {
        this.volume = volume;
        this.power = power;
        this.cylinders = cylinders;
    }

    public float getVolume() {return volume;}
    public float getPower() {return power;}
    public int getCylinders() {return cylinders;}

    public String toEngine() {
        String inf = ", volume: " + volume + ", power: " + power + ", cylinders " + cylinders;
        return inf;
    }
}
