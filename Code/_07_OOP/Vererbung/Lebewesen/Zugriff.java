package _07_OOP.Vererbung.Lebewesen;
import java.util.Scanner;

public class Zugriff {
    public static void main(String[] args) {
        Rose aktuell = new Rose("", 0, "");
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte geben Sie den Namen Ihrer Rose ein!");
        String n = scan.nextLine();
        aktuell.setName(n);
        System.out.println("Bitte geben Sie das Alter Ihrer Rose ein!");
        int a = scan.nextInt();
        aktuell.setAlter(a);
        System.out.println("Bitte geben Sie die Farbe Ihrer Rose ein!");
        String f = scan.next();
        aktuell.setFarbe(f);
        System.out.println("Ihre " + aktuell.getFarbe() + "e Rose " + aktuell.getName() + " ist " +
                aktuell.getAlter() + " Jahre alt!");
        System.out.println("Wollen sie Ihre Rose gießen oder wachsen lassen? (gießen/wachsen)");
        String auswahl = scan.next();
        if (auswahl.equals("gießen")) {
            aktuell.giessen();
        }
        else if (auswahl.equals("wachsen")) {
            aktuell.wachsen();
        }
    }
}
