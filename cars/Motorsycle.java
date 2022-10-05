package cars;

public class Motorsycle extends Vehicle {

    protected String frame;
    protected final float steering;

    public Motorsycle(Engine engine, String frame, Chassis chassis, float steering) {
        super(engine, chassis);
        this.frame = frame;
        this.steering = steering;
    }

    // BMW G 310 R
    // KAWASAKI NINJA 400
    // SUZUKI SV650 ABS (SV650A)
    // YAMAHA XJ6
    // BMW F 800 GT
    // HARLEY-DAVIDSON SUPERLOW
    // Ford Fiesta - автомобиль
    // Kia Picanto- автомобиль
    // Infiniti QX60- автомобиль
    // Nissan Juke- автомобиль
    // Audi А3- автомобиль
    // Lexus ES 200- автомобиль
    // Honda Talon 1000X- автомобиль
    // RM 800 DUO - квадроцикл
    // Stels ATV 650 Guepard ST - квадроцикл
    // Yamaha YFZ450R SE - квадроцикл
    // CFMOTO CFORCE 600 S EPS - квадроцикл
    // Polaris Sportsman 570 - квадроцикл

    @Override
    public String toString() {
        String inf = "Type of Vehicle: " + "Motorsycle, " + "frame: " + frame + ", steering: " + steering;
        return inf;
    }

    @Override
    public int getMaxSpeed() {
        return (int) chassis.getSpeedMax();
        
    }
    
    @Override
    public String getEnvironment() {
        String inf = "Motorsycle";
        return inf;
    }

}
