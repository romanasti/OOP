package cars.type;

public class Flying extends Vehicle {
    private final float rotor_diametr;
    private final int ractical_range;
    private final int max_flight_altitude;

    public Flying(Engine engine, Chassis chassis, float rotor_diametr, int ractical_range, int max_flight_altitude, String brand, String model) {
        super(engine,chassis, brand, model);
        this.rotor_diametr = rotor_diametr;
        this.ractical_range = ractical_range;
        this.max_flight_altitude = max_flight_altitude;
    }

    @Override
    public String toString() {
        String inf = "Type of Vehicle: " + getEnvironment() + ", brand: "+ brand +", model: "+ model + ", maxSpeed: " + getMaxSpeed() + ", rotor_diametr: " + rotor_diametr + ", ractical_range: " + ractical_range + ", max_flight_altitude: " + max_flight_altitude + chassis.toChassis()+ " "+ engine.toEngine();
        return inf;
    }

@Override
public int getMaxSpeed() {
    return (int) chassis.getSpeedMax();
    
}

public String getEnvironment() {
    String inf = "Helicopter";
    return inf;
}
}
