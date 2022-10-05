package cars;

public class Floating extends Vehicle {

    private final String body_type;
    private final String body_material;
    private final String intake_system;


    public Floating(Engine engine, Chassis chassis, String body_type, String body_material, String intake_system) {
        super(engine, chassis);
        this.body_type = body_type;
        this.body_material = body_material;
        this.intake_system = intake_system;
    }

    @Override
    public String toString() {
        return String.format("Type of Vehicle: %s, body_type: $s, seats: %s, max speed: %s, steering: %s, body_material: %s", "Floating", body_type, 4, 50f, body_material, 1.6f);
    }


// SEA-DOO PERFORMANCE RXP-X 300 - гидроцикл
// YAMAHA FX CRUISER SVHO - гидроцикл
// SEA-DOO SPARK TRIXX 3UP - гидроцикл
    
}
