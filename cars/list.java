package cars;


import java.util.ArrayList;
import java.util.List;

import cars.type.Chassis;
import cars.type.Engine;
import cars.type.Motorsycle;
import cars.type.Vehicle;

public class list {

    public static List<Vehicle> List() {

        List<Vehicle> cars = new ArrayList<>();

        Engine bmw1 = new Engine(313, 34, 1);
        Chassis bmw2 = new Chassis(2, 11.0f, 143, 2005, 849, 1080);
        Motorsycle bmw3 = new Motorsycle(bmw1, "frame", bmw2, "urban", "BMW", "G310R");
        cars.add(bmw3);

        Engine kawa1 = new Engine(399, 45, 2);
        Chassis kawa2 = new Chassis(2, 14.0f, 188, 1990, 710, 1120);
        Motorsycle kawa3 = new Motorsycle(kawa1, "high-yield-point steel", kawa2, "sport", "Kawasaki", "Ninja400");
        cars.add(kawa3);

        Engine suz1 = new Engine(645, 76, 2);
        Chassis suz2 = new Chassis(2, 13.8f, 203, 2140, 760, 785);
        Motorsycle suz3 = new Motorsycle(suz1, "steel tubular", suz2, "naked", "Suzuki", "SV650");
        cars.add(suz3);


        // BMW G 310 R - мотоцикл
        // KAWASAKI NINJA 400 - мотоцикл
        // SUZUKI SV650 ABS (SV650A)- мотоцикл
        // YAMAHA XJ6 - мотоцикл
        // BMW F 800 GT- мотоцикл
        // HARLEY-DAVIDSON SUPERLOW- мотоцикл
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
        // SEA-DOO PERFORMANCE RXP-X 300 - гидроцикл
        // YAMAHA FX CRUISER SVHO - гидроцикл
        // SEA-DOO SPARK TRIXX 3UP- гидроцикл
        // GEN H-4 - вертолет
        // Air Scooter 2 - вертолет
        // Dynali H2S - вертолет
        // DF Helicopters DF334 - вертолет
        return cars;
    }

}
