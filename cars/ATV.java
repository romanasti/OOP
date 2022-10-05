package cars;

public class ATV extends Motorsycle {
    public ATV(Engine engine, Chassis chassis, String frame, float steering) {
        super(engine,frame,chassis,steering);
    }

    @Override
    public String toString() {
        String inf = "Type of Vehicle: " + "ATV, " + "frame: " + frame + ", steering: " + steering;
        return inf;
    }
}
