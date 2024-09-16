package _02_DatentypenVariablen;

import java.util.Scanner;

public class Datentypen_ersteUebung {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Dein Name:");
        String name = scan.nextLine();
        System.out.println("Hallo "+name+"!\n");

        System.out.println("Gib dein Alter ein:");
        final int ALTER = scan.nextInt();
        System.out.println("Du bist "+ALTER+" Jahre alt.\n");

        System.out.println("Eine Zahl:");
        float a = scan.nextFloat();
        System.out.println("->"+a +"\n");

        System.out.println("'Ja' oder 'Nein':");
        String antwort = scan.next();

        if (antwort.equals("Ja"))   {
            boolean detector = true;
            System.out.println("Deine Antwort war 'Ja' -> "+detector);
        }
        else if (antwort.equals("Nein")) {
            boolean detector = false;
            System.out.println("Deine Antwort war 'Nein' -> "+detector);
        }
        else    {
            System.out.println("Gib eine gültige Antwort ein...");
        }
    }
}