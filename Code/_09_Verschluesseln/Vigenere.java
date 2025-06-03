package _09_Verschluesseln;

import java.util.Scanner;

public class Vigenere {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Scanner key = new Scanner(System.in);
        Scanner word = new Scanner(System.in);
        //Eingabe
        System.out.println("Wort:");
        String wort = word.nextLine().toUpperCase(); //nur Großbuchstaben
        System.out.println("Schlüssel:");
        String schlüssel = key.nextLine().toUpperCase(); //alles groß
        int a = wort.length() ;
        int b = a / schlüssel.length(); //Schlüsselwort mindestens gleich lang wie zu verschlüsselndes Wort
        String hilfe = schlüssel;
        for (int i = 1; i <= b ; i++) schlüssel = schlüssel + hilfe;
        //verschlüssle, achte auf Alphabetsgrenzen (nach Z bei A weiter!)
        String verwort = "";
        int n;
        for (int i = 0; i <= a-1 ; i++) {
            n = (int)wort.charAt(i) + ((int)schlüssel.charAt(i) - 65);
            if (n > 90) n = n - 26;
            verwort = verwort + (char)n;
        }
        //Ausgabe
        System.out.println("Verschlüsseltes Wort:");
        for (int i = 0; i <= a-1 ; i++ ) System.out.print("" + verwort.charAt(i));
        System.out.println("");
        System.out.println("");
        System.out.println("****************************");
        System.out.println("");
        //Eingabe
        System.out.println("Bitte Schlüssel eingeben:");
        String entschlüssel = ent.nextLine().toUpperCase();
        b = a / entschlüssel.length(); //Entschlüsselwort mindestens gleich lang wie zu verschlüsselndes
        hilfe = entschlüssel;
        for (int i = 1; i <= b ; i++) entschlüssel = entschlüssel + hilfe;
        //entschlüssle
        String ursprung = "";
        for (int i = 0; i <= a-1 ; i++) {
            n = (int)verwort.charAt(i) - ((int)entschlüssel.charAt(i) - 65);
            if (n < 65) n = n + 26;
            ursprung = ursprung + (char)n;
        }
        System.out.println("Ursprüngliches Wort: ");
        for (int i = 0; i <= a-1; i++) System.out.print("" + ursprung.charAt(i));
        System.out.println("");
        System.out.println("");
        System.out.println("****************************");
        System.out.println("");
    }
} 