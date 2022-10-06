package cars.type;

public class ATV extends Motorsycle {
    public ATV(Engine engine, Chassis chassis, String frame, String moto_type, String brand, String model) {
        super(engine,frame,chassis,moto_type, brand, model);
    }

    @Override
    public String toString() {
        String inf = "Type of Vehicle: " + getEnvironment() + ", brand: "+ brand +", model: "+ model + ", maxSpeed: " + getMaxSpeed() + ", frame: " + frame + ", moto_type: " + moto_type + chassis.toChassis()+ " "+ engine.toEngine();
        return inf;
    }
    @Override
    public String getEnvironment() {
        String inf = "ATV";
        return inf;
    }
}
