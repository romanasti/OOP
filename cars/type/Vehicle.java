package cars.type;

import cars.description;

public abstract class Vehicle implements description {
    protected final Engine engine;
    protected final Chassis chassis;
    protected final String brand;
    protected final String model;


    public Vehicle(Engine engine, Chassis chassis) {
        this.engine = engine;
        this.chassis = chassis;
        this.brand = "";
        this.model = "";
    }

    public Vehicle(Engine engine, Chassis chassis, String brand, String model){
        this.engine = engine;
        this.chassis = chassis;
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        String inf = "brand: "+ brand +" model: "+ model;
        return inf;
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
