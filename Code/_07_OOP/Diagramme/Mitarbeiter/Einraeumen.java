package _07_OOP.Diagramme.Mitarbeiter;
import java.util.Scanner;

public class Einraeumen { //Zugriffsklasse für Interaktion
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String antwort = "";
        Mitarbeiter Mitarbeiter1 = new Mitarbeiter("Hans");
        Regal Regal1 = new Regal("Halle1");
        Ware Sizzurp = new Ware("Sizzurp", 1337);
        Ware Steamguthaben = new Ware("20€ Steam", 360);
        Ware Ritopoints = new Ware("20€ Rito", 420);
        System.out.println("Regal einräumen?");
        antwort = scan.next();
        if (antwort.equals("ja") || antwort.equals("j")) {
            Mitarbeiter1.regalEinräumen(Regal1, 1, Sizzurp);
            System.out.println("Der Mitarbeiter " + Mitarbeiter1.getName() + " räumt das Regal am Standort " + Regal1.getStandort());
            System.out.println("mit der Ware " + Sizzurp.getName() + " mit der Artikelnummer " + Sizzurp.getArtNr() + "  ins Fach " + 1 + " ein.");
        }
        else {
            System.exit(0);
        }
    }
}
