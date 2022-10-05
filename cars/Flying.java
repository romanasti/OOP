package cars;

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
// GEN H-4 - вертолет
// Air Scooter 2 - вертолет
// Dynali H2S - вертолет
// DF Helicopters DF334 - вертолет

@Override
public String toString() {
    String inf = "Type of Vehicle: " + "Flying, " + "rotor_diametr: " + rotor_diametr + ", ractical_range: " + ractical_range + ",  rate_of_climb " + rate_of_climb;
    return inf;
}

public String getSpeed() {
    String inf = "max speed: " + chassis.getMaxSpeed();
    return inf;
}

public String getEnvironment() {
    String inf = "Flying vehicle";
    return inf;
}
}
