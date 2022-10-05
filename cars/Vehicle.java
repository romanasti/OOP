package cars;

public abstract class Vehicle {
    protected final Engine engine;
    protected final Chassis chassis;
    protected String typeofVehicle;


    public Vehicle(Engine engine, Chassis chassis) {
        this.engine = engine;
        this.chassis = chassis;
    }

    public Vehicle(Engine engine, Chassis chassis, String typeofVehicle) {
        this(engine, chassis);
        this.typeofVehicle = typeofVehicle;
    }


}
