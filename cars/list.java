package cars;


import java.util.ArrayList;
import java.util.List;

import cars.type.ATV;
import cars.type.Cars;
import cars.type.Chassis;
import cars.type.Engine;
import cars.type.Floating;
import cars.type.Motorsycle;
import cars.type.Vehicle;

public class list {

    public static List<Vehicle> List() {

        List<Vehicle> transport = new ArrayList<>();

        // Moto

        Engine bmw1 = new Engine(313, 34, 1);
        Chassis bmw2 = new Chassis(2, 11.0f, 143, 2005, 849, 1080);
        Motorsycle bmw3 = new Motorsycle(bmw1, "frame", bmw2, "urban", "BMW", "G310R");
        transport.add(bmw3);

        Engine kawa1 = new Engine(399, 45, 2);
        Chassis kawa2 = new Chassis(2, 14.0f, 188, 1990, 710, 1120);
        Motorsycle kawa3 = new Motorsycle(kawa1, "high-yield-point steel", kawa2, "sport", "Kawasaki", "Ninja400");
        transport.add(kawa3);

        Engine suz1 = new Engine(645, 76, 2);
        Chassis suz2 = new Chassis(2, 13.8f, 203, 2140, 760, 785);
        Motorsycle suz3 = new Motorsycle(suz1, "steel tubular", suz2, "naked", "Suzuki", "SV650");
        transport.add(suz3);

        // Car

        Engine inf1 = new Engine(3498, 262, 6);
        Chassis inf2 = new Chassis(7, 73f, 190, 5093, 1960, 1742);
        Cars inf3 = new Cars(inf1, inf2, "Infiniti", "QX60", "petrol", 2900);
        transport.add(inf3);

        Engine niss1 = new Engine(1598, 117, 4);
        Chassis niss2 = new Chassis(5, 46f, 170, 4135, 1765, 1565);
        Cars niss3 = new Cars(niss1, niss2, "Nissan", "Juke", "petrol", 2530);
        transport.add(niss3);

        Engine aud1 = new Engine(1197, 105, 4);
        Chassis aud2 = new Chassis(5, 55f, 192, 4292, 1765, 1423);
        Cars aud3 = new Cars(aud1, aud2, "Audi", "A3", "petrol", 2578);
        transport.add(aud3);

        // ATV

        Engine rm1 = new Engine(800, 60, 2);
        Chassis rm2 = new Chassis(2, 24.5f, 100, 2340, 1210, 1480);
        ATV rm3 = new ATV(rm1, rm2, "steel", "atv", "RM", "800Duo");
        transport.add(rm3);

        Engine stel1 = new Engine(650, 52, 2);
        Chassis stel2 = new Chassis(2, 30f, 90, 2390, 1350, 1545);
        ATV stel3 = new ATV(stel1, stel2, "tubular, welded", "atv", "Stels", "ATV650_GuepardSt");
        transport.add(stel3);

        Engine yam1 = new Engine(449, 39, 1);
        Chassis yam2 = new Chassis(1, 10f, 80, 1795, 1240, 1065);
        ATV yam3 = new ATV(yam1, yam2, "aluminum", "sport", "Yamaha", "YFZ450R_SE");
        transport.add(yam3);

        // jet sky

        Engine yam1 = new Engine(449, 39, 1);
        Chassis yam2 = new Chassis(1, 10f, 80, 1795, 1240, 1065);
        Floating yam3 = new Floating(yam1, yam2, null, null);
        transport.add(yam3);

        Engine yam1 = new Engine(449, 39, 1);
        Chassis yam2 = new Chassis(1, 10f, 80, 1795, 1240, 1065);
        Floating yam3 = new Floating(yam1, yam2, null, null);
        transport.add(yam3);

        Engine yam1 = new Engine(449, 39, 1);
        Chassis yam2 = new Chassis(1, 10f, 80, 1795, 1240, 1065);
        Floating yam3 = new Floating(yam1, yam2, null, null);
        transport.add(yam3);
        




        // SEA-DOO PERFORMANCE RXP-X 300 - гидроцикл
        // YAMAHA FX CRUISER SVHO - гидроцикл
        // SEA-DOO SPARK TRIXX 3UP- гидроцикл

        // GEN H-4 - вертолет
        // Air Scooter 2 - вертолет
        // Dynali H2S - вертолет

        return transport;
    }

}
