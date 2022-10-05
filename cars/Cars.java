package cars;

public class Cars extends Vehicle {
    private final String drive;
    private int[] wheel_size;
    private final int wheelbase;


    public Cars(Engine engine, Chassis chassis, String drive, int[] wheel_size, int wheelbase) {
        super(engine,chassis);
        this.drive = drive;
        this.wheelbase = wheelbase;
        this.wheel_size = new int[3];
        this.wheel_size = wheel_size;
    }
    @Override
    public String toString() {
        return String.format("Type of Vehicle: %s, drive: $s, seats: %s, max speed: %s, wheelbase: %s, volume of engine: %s", "Car", drive, 4, 50f, wheelbase, 1.6f);
    }
}
