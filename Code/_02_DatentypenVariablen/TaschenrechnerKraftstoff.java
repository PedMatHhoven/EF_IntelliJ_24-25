package _02_DatentypenVariablen;

import java.util.Scanner;

public class TaschenrechnerKraftstoff{
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("addieren(1), subtrahieren(2), multiplizieren(3), dividieren(4) oder Kraftstoffrechner(5)");
        double UI = ui.nextDouble();
        if (UI == 5) {
            Scanner Km = new Scanner(System.in);
            System.out.println("Geben sie die gefahrenen Kilometer ein.");
            double km = Km.nextDouble();
            Scanner Krst = new Scanner(System.in);
            System.out.println("Geben sie die verbrauchten Liter ein.");
            double krst = Krst.nextDouble();
            double verbrauch = krst/km*100;
            System.out.println("Ihr durchschnittlicher Kraftstoffverbrauch auf 100 Km ist " + verbrauch + " Liter.");
        }
        else {
            Scanner erstezahl = new Scanner(System.in);
            System.out.println("Geben Sie ihre erste Zahl ein.");
            double number1 = erstezahl.nextDouble();
            Scanner zweitezahl = new Scanner(System.in);
            System.out.println("Geben sie Ihre zweite Zahl ein.");
            double number2 = zweitezahl.nextDouble();
            double e1 = 0;
            if (UI == 1) {
                e1 = number1 + number2;
            } else if (UI == 2) {
                e1 = number1 - number2;
            } else if (UI == 3) {
                e1 = number1 * number2;
            } else if (UI == 4) {
                e1 = number1 / number2;
            }
            System.out.println(e1);
        }
    }
}