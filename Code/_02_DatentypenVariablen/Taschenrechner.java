package _02_DatentypenVariablen;

import java.util.Scanner;

public class Taschenrechner {
    public static void main(String[] args) {
        System.out.println("<<Taschenrechner>> \n");
        System.out.println("Folgende Programme stehen zur Auswahl: \n 1.Addition \n 2.Subtraktion \n 3.Multiplikation \n 4.Division \n 5.Weiter");
        System.out.println("Gib eine Zahl zur passenden Ausführung ein:");
        Scanner scan = new Scanner(System.in);
        int program = scan.nextInt();

        if (program == 1) {
            System.out.println("Zahl 1:");
            int a = scan.nextInt();
            System.out.println("Zahl 2:");
            int b = scan.nextInt();
            System.out.println("Ergebnis: "+a+"+"+b+"="+(a+b));
        } else if (program == 2) {
            System.out.println("Zahl 1:");
            int a = scan.nextInt();
            System.out.println("Zahl 2:");
            int b = scan.nextInt();
            System.out.println("Ergebnis: "+a+"-"+b+"="+(a-b));
        } else if (program == 3) {
            System.out.println("Zahl 1:");
            int a = scan.nextInt();
            System.out.println("Zahl 2:");
            int b = scan.nextInt();
            System.out.println("Ergebnis: "+a+"*"+b+"="+(a*b));
        } else if (program == 4) {
            System.out.println("Zahl 1:");
            int a = scan.nextInt();
            System.out.println("Zahl 2:");
            int b = scan.nextInt();
            System.out.println("Ergebnis: "+a+"/"+b+"="+(a/b));
        } else if (program == 5) {
            System.out.println("weiter...");
        } else System.out.println("Gib eine gültige Eingabe ein...");

        System.out.println("<<Durchschnittsverbrauch>> \n");
        System.out.println("Geben Sie die gefahrenen Kilometer ein z.B. 100 oder 100,50:");
        float km = scan.nextFloat();
        System.out.println("Geben Sie die verbrauchten Liter ein:");
        float l = scan.nextFloat();
        float durchschnittV = l/km * 100;
        System.out.println("Du verbrauchst auf 100km "+durchschnittV+"l.");
    }
}