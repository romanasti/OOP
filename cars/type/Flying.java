package cars.type;

public class Flying extends Vehicle {
    private final float rotor_diametr;
    private final int ractical_range;
    private final int rate_of_climb;

    public Flying(Engine engine, Chassis chassis, float rotor_diametr, int ractical_range, int rate_of_climb) {
        super(engine,chassis);
        this.rotor_diametr = rotor_diametr;
        this.ractical_range = ractical_range;
        this.rate_of_climb = rate_of_climb;
    }

@Override
public String toString() {
    String inf = "Type of Vehicle: " + "Flying, " + "rotor_diametr: " + rotor_diametr + ", ractical_range: " + ractical_range + ",  rate_of_climb " + rate_of_climb;
    return inf;
}

@Override
public int getMaxSpeed() {
    return (int) chassis.getSpeedMax();
    
}

public String getEnvironment() {
    String inf = "Flying vehicle";
    return inf;
}
}
