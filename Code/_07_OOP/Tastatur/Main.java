package _07_OOP.Tastatur;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Welche Farbe soll deine Tastatur haben?: ");
        String Wahlfarbe = scan.nextLine();

        System.out.println("_________________________________________________________________________________________");

        System.out.print("\nWelche Keycaps möchtest du haben? (PBT/ ABS)");
        System.out.println("\n!Hinweis!\nPBT: PBT-Tastenkappen sind langlebiger, griffiger und resistenter gegen Abnutzung als ABS-Tastenkappen, aber auch teurer." +
                "\nABS: ABS-Tastenkappen sind günstig und glatt, verschleißen aber schneller und entwickeln einen polierten Glanz im Vergleich zu PBT-Tastenkappen.");
        System.out.print("Wahl: ");
        String keycapswahl = scan.nextLine();

        System.out.println("_________________________________________________________________________________________");

        System.out.println("\nWelche Switches möchtest du haben? (Linear/ Taktile/ Clicky)");
        System.out.println("!Hinweis! \nLineare Switches: Gleichmäßiger Widerstand, kein Feedback.\n" +
                "Taktile Switches: Spürbarer Widerstand als Feedback.\n" +
                "Clicky Switches: Spürbarer Widerstand und hörbares Klicken als Feedback.");
        System.out.print("Wahl: ");
        String switchwahl = scan.nextLine();

        System.out.println("_________________________________________________________________________________________");

        System.out.print("\nWie viel Prozent soll die Tastatur haben?(60%/ 75%/ 100%): ");
        int Prozent = scan.nextInt();

        double kosten1 = 0;
        if (Prozent == 60 || Prozent == 75 || Prozent == 100){
            if (Prozent == 60){
                kosten1 = 70;
            }
            else if (Prozent == 75) {
                kosten1 = 87.5;
            }
            else if (Prozent == 100) {
                kosten1 = 120;
            }
            Tastatur zugriff = new Tastatur(Wahlfarbe, keycapswahl, switchwahl, Prozent, kosten1);

            System.out.println("_____________________________________________________________________________________");

            System.out.println("Ihre Tastatur ist fertig. Zustellung: Nie.");
            System.out.println("Farbe: " + zugriff.getFarbe());
            System.out.println("Keycaps: " + zugriff.getKeycaps());
            System.out.println("Switches: " + zugriff.getSwitches());
            System.out.println("Prozent: " + zugriff.getProzent() + "%");
            System.out.println("Kosten: " + zugriff.getKosten());
        }
        else {
            System.out.print("Ungültig, zur Wahl stehen nur 60%, 75%, 100%.");
            System.out.println("\nBeginne erneut!");
        }
    }
}
