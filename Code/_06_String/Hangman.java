package _06_String;

import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        String geheimesWort = "FORTNITE".toUpperCase();
        String verborgenesWort = "";
        for (int i = 0; i < geheimesWort.length(); i++) verborgenesWort += "*";
        int versuche = 6;
        boolean gewonnen = false;
        System.out.println("Willkommen zu Hangman!");
        System.out.println("Errate das Wort: " + verborgenesWort);
        while (versuche > 0 && !gewonnen) {
            System.out.print("Gib einen Buchstaben ein: ");
            char buchstabe = eingabe.next().toUpperCase().charAt(0);
            if (geheimesWort.indexOf(buchstabe) != -1) {
                System.out.println("Der Buchstabe '" + buchstabe + "' ist richtig!");
                verborgenesWort = buchstabenFreilegen(geheimesWort, verborgenesWort, buchstabe);
            } else {
                versuche--;
                System.out.println("Falsch! Du hast noch " + versuche + " Versuche.");
            }
            System.out.println("Aktueller Stand: " + verborgenesWort);
            if (verborgenesWort.equals(geheimesWort)) {
                gewonnen = true;
                System.out.println("Glückwunsch! Du hast das Wort erraten: " + geheimesWort);
            }
        }
        if (!gewonnen) System.out.println("Leider verloren! Das Wort war: " + geheimesWort);
        eingabe.close();
    }

    public static String buchstabenFreilegen(String geheimesWort, String verborgenesWort, char buchstabe) {
        String ergebnis = "";
        for (int i = 0; i < geheimesWort.length(); i++) {
            if (geheimesWort.charAt(i) == buchstabe) ergebnis += buchstabe;
            else ergebnis += verborgenesWort.charAt(i);
        }
        return ergebnis;
    }
}