package cars.type;

public class ATV extends Motorsycle {
    public ATV(Engine engine, Chassis chassis, String frame, String moto_type, String brand, String model) {
        super(engine,frame,chassis,moto_type, brand, model);
    }

    @Override
    public String toString() {
        String inf = "Type of Vehicle: " + "ATV, " + "frame: " + frame + ", steering: " + moto_type;
        return inf;
    }
}
