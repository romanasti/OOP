package cars.type;

public class Floating extends Vehicle {

    private final String body_type;
    private final String body_material;


    public Floating(Engine engine, Chassis chassis, String body_type, String body_material) {
        super(engine, chassis);
        this.body_type = body_type;
        this.body_material = body_material;
    }

    @Override
    public String toString() {
        String inf = "Type of Vehicle: " + "Floating, " + "body_type: " + body_type + ", body_materials: " + body_material;
        return inf;
    }
    
    @Override
    public int getMaxSpeed() {
        return (int) chassis.getSpeedMax();
    }
    
    public String getEnvironment() {
        String inf = "Floating vehicle";
        return inf;
    }


// SEA-DOO PERFORMANCE RXP-X 300 - гидроцикл
// YAMAHA FX CRUISER SVHO - гидроцикл
// SEA-DOO SPARK TRIXX 3UP - гидроцикл
    
}
