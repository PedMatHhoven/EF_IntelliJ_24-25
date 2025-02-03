package _07_OOP.Auto;

import java.util.Scanner;

public class Zugriff {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dies ist dein Auto Konfigurator, geben sie folgende Daten ein.");

        System.out.println("Wie soll das Auto heißen? ");
        String Name = scan.nextLine();

        System.out.println("Wie viele Türen soll das Auto haben? ");
        int Türanzahl = scan.nextInt();

        System.out.println("Wie viel PS soll das Auto haben? ");
        int PS = scan.nextInt();

        System.out.println("Welche Farbe? ");
        String Farbe = scan.next();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Auf welchen Besitzer sollen wir das Auto anmelden? ");
        String Besitzer = scanner.nextLine();

        System.out.println();

        Auto custom = new Auto(Türanzahl, PS, Name, Farbe, Besitzer);
        System.out.println("Name: " + custom.getName());
        System.out.println("Türen: " + custom.getTueren());
        System.out.println("PS: " + custom.getPS());
        System.out.println("Farbe: " + custom.getFarbe());
        System.out.println("Besitzer: " + custom.getBesitzer());

        System.out.println("Möchtest du dein Auto noch tunen?: (Ja/Nein)");
        String antwort = scan.next();
        if (antwort.equals("Ja")) { custom.tunen();
        } else if (antwort.equals("Nein")) { System.out.println("Ok, dann halt nicht");
        }

        System.out.println("Soll ich dir das in einer Zufallsfarbe lackieren? Normalerweise 200 Euro aber für dich 10 Euro (Ja/Nein)");
        String antwort2 = scanner.nextLine();
        if (antwort2.equals("Ja")) { custom.lackieren();
        } else if (antwort2.equals("Nein")) {
            System.out.println("Ok aber du hast den Deal deines Lebens verpasst");
        }
    }
}