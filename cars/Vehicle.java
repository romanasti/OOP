package cars;

public abstract class Vehicle implements description {
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

    @Override
    public String toString() {
     return null;
    }

    @Override
    public int getMaxSpeed() {
        return (int) chassis.getSpeedMax();
        
    }

    @Override
    public String getEnvironment() {
       return null;
    }


}
