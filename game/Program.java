package game;

import java.util.ArrayList;
import java.util.List;

import game.Chars.Crossbow;
import game.Chars.Magician;
import game.Chars.Monk;
import game.Chars.Outlaw;
import game.Chars.Peasant;
import game.Chars.Sniper;
import game.Chars.Spearman;


public class Program {
    public static void main(String[] args) {
        List<Magician> allMagician = new ArrayList<>();
        List<Sniper> allSniper = new ArrayList<>();
        List<Crossbow> allCrossbow = new ArrayList<>();
        List<Monk> allMonk = new ArrayList<>();
        List<Outlaw> allOutlaw = new ArrayList<>();
        List<Peasant> allPeasant = new ArrayList<>();
        List<Spearman> allSpearman = new ArrayList<>();

        while (allMagician.size() < 5) {allMagician.add(new Magician("Ezios"));}
        while (allSniper.size() < 5) {allSniper.add(new Sniper("Lixo"));}
        while (allCrossbow.size() < 5) {allCrossbow.add(new Crossbow("Taurus"));}
        while (allMonk.size() < 5) {allMonk.add(new Monk("Veron"));}
        while (allOutlaw.size() < 5) {allOutlaw.add(new Outlaw("Vastik"));}
        while (allPeasant.size() < 5) {allPeasant.add(new Peasant("Protol"));}
        while (allSpearman.size() < 5) {allSpearman.add(new Spearman("Nolen"));}
            
        for (Magician magician : allMagician) {System.out.println(magician.getName() +" -> "+ magician.getInfo());}
        for (Sniper sniper : allSniper) {System.out.println(sniper.getName() +" -> "+ sniper.getInfo());}
        for (Crossbow crossbow : allCrossbow) {System.out.println(crossbow.getName() +" -> "+ crossbow.getInfo());}
        for (Monk monk : allMonk) {System.out.println(monk.getName() +" -> "+ monk.getInfo());}
        for (Outlaw outlaw : allOutlaw) {System.out.println(outlaw.getName() +" -> "+ outlaw.getInfo());}
        for (Peasant peasnt : allPeasant) {System.out.println(peasnt.getName() +" -> "+ peasnt.getInfo());}
        for (Spearman spearman : allSpearman) {System.out.println(spearman.getName() +" -> "+ spearman.getInfo());}
      
    }

}
