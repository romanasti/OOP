package cars.type;

public class Motorsycle extends Vehicle {

    protected String frame;
    protected final String moto_type;

    public Motorsycle(Engine engine, String frame, Chassis chassis, String moto_type, String brand, String model) {
        super(engine, chassis, brand, model);
        this.frame = frame;
        this.moto_type = moto_type;
    }

    @Override
    public String toString() {
        String inf = "Type of Vehicle: " + getEnvironment() + ", brand: "+ brand +", model: "+ model + ", maxSpeed: " + getMaxSpeed() + ", frame: " + frame + ", moto_type: " + moto_type + chassis.toChassis()+ " "+ engine.toEngine();
        return inf;
    }

    @Override
    public int getMaxSpeed() {
        return (int) chassis.getSpeedMax();
        
    }
    
    @Override
    public String getEnvironment() {
        String inf = "Motorsycle";
        return inf;
    }

}
