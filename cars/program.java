package cars;

public class program {
    public static void main(String[] args) {
        Engine engine = new Engine(1, 1, "95");
        Chassis chassis = new Chassis(4, 100, 4, 200, 2, 1);
        Motorsycle motorsycle = new Motorsycle(engine, "frame", chassis, 64.3f);
        System.out.println(motorsycle.toString());


        ATV atv = new ATV(engine, chassis, "frame", 78.8f);
        System.out.println(atv.toString());
        Cars car = new Cars(engine, chassis, "S", 2680);
        System.out.println(car.toString());
        Flying flying = new Flying(engine, chassis, 3.5f, 1000, 40);
        System.out.println(flying.toString());
        Floating water = new Floating(engine, chassis, "body_type", "body_material");
        System.out.println(water.toString());
    }


}
