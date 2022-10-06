package cars.type;

public class Cars extends Vehicle {
    private final String drive;
    private final int wheelbase;


    public Cars(Engine engine, Chassis chassis, String brand, String model, String drive, int wheelbase) {
        super(engine,chassis,brand,model);
        this.drive = drive;
        this.wheelbase = wheelbase;
    }
    @Override
    public String toString() {
        String inf = "Type of Vehicle: " + getEnvironment() + ", brand: "+ brand +", model: "+ model + ", maxSpeed: " + getMaxSpeed() + ", drive: " + drive + ", wheelbase: " + wheelbase + chassis.toChassis()+ " "+ engine.toEngine();
        return inf;
    }

    @Override
    public int getMaxSpeed() {
        return (int) chassis.getSpeedMax();
        
    }
    
    @Override
    public String getEnvironment() {
        String inf = "Car";
        return inf;
    }

}
