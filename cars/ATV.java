package cars;

public class ATV extends Motorsycle {
    public ATV(Engine engine, Chassis chassis, String frame, float steering) {
        super(engine,frame,chassis,steering);
    }

    @Override
    public String toString() {
        return String.format("Type of Vehicle: %s, frame: $s, seats: %s, max speed: %s, steering: %s, volume of engine: %s", "ATV", "frame", 4, 50f, "steering", 1.6f);
    }
}
