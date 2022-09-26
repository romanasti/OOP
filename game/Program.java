package game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import game.Chars.Crossbow;
import game.Chars.Magician;
import game.Chars.Monk;
import game.Chars.Outlaw;
import game.Chars.Peasant;
import game.Chars.Sniper;
import game.Chars.Spearman;


public class Program {
    public static void main(String[] args) {
     
        List<BaseHero> darkSide = new ArrayList<>();
        List<BaseHero> lightSide = new ArrayList<>();

        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            switch (rnd.nextInt(7)) {
                case 0:
                    darkSide.add(new Peasant(darkSide, 0, 0));
                    break;
                case 1:
                    darkSide.add(new Outlaw(darkSide, 0, 0));
                    break;
                case 2:
                    darkSide.add(new Sniper(darkSide, 0, 0));
                    break;
                case 3:
                    darkSide.add(new Spearman(darkSide, 0, 0));
                    break;
                case 4:
                    darkSide.add(new Magician(darkSide, 0, 0));
                    break;
                case 5:
                    darkSide.add(new Crossbow(darkSide, 0, 0));
                    break;
                default:
                    darkSide.add(new Monk(darkSide, 0, 0));

            }

        }
        for (int i = 0; i < 10; i++) {
            switch (rnd.nextInt(7)) {
                case 0:
                    lightSide.add(new Peasant(lightSide, 0, 0));
                    break;
                case 1:
                    lightSide.add(new Outlaw(lightSide, 0, 0));
                    break;
                case 2:
                    lightSide.add(new Sniper(lightSide, 0, 0));
                    break;
                case 3:
                    lightSide.add(new Spearman(lightSide, 0, 0));
                    break;
                case 4:
                    lightSide.add(new Magician(lightSide, 0, 0));
                    break;
                case 5:
                    lightSide.add(new Crossbow(lightSide, 0, 0));
                    break;
                default:
                    lightSide.add(new Monk(lightSide, 0, 0));

            }

        }

        Scanner in = new Scanner(System.in);
        while (true) {
            String txt = in.nextLine();
            if (txt.equals("N")) {
                for (int index = 0; index < darkSide.size(); index++) {
                    darkSide.get(index).step(lightSide);
                    lightSide.get(index).step(darkSide);
                    if (darkSide.get(index).returnCondtion().length() > 27) {
                        System.out.println(
                                darkSide.get(index).returnCondtion() + "\t:\t" + lightSide.get(index).returnCondtion());
                    } else {
                        System.out.println(
                                darkSide.get(index).returnCondtion() + "\t\t:\t"
                                        + lightSide.get(index).returnCondtion());
                    }
                }
            }
            if (txt.equals("Q")) {
                break;
            }

        }

    }

}
