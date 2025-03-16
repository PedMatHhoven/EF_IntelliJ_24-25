package _07_OOP.Vererbung.Lebewesen;
import java.util.Scanner;

public class Pflanzen extends Lebewesen{
    protected String Farbe;

    public Pflanzen (String name, int alter, String farbe){
        super(name, alter);
        Farbe = farbe;
    }
    public void setFarbe(String farbe) {
        Farbe = farbe;
    }
    public String getFarbe() {
        return Farbe;
    }

    public void wachsen() {
        Scanner wachstum = new Scanner(System.in);
        System.out.println("Wie viele Tage sind vorüber?");
        int tage = wachstum.nextInt();
        if (tage < 10) {
            System.out.println("Die Pflanze ist " + tage + " cm größer geworden!");
        }
        else if (tage >= 10) {
            System.out.println("Die Pflanzen ist 10 cm größer geworden! Sie ist nun ausgewachsen!");
        }
    }

    public void giessen() {
        Scanner gegossen = new Scanner(System.in);
        System.out.println("Wie viel Wasser wollen Sie ihrer Pflanze geben? (Angabe in ml)");
        String wasser = gegossen.nextLine();
        System.out.println("Ihre Pflanze wurde mit " + wasser + " ml Wasser gegossen.");
    }
}