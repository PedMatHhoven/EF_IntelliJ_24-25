package _05_Methoden;

import java.util.Scanner;

public class warmwerden_eigeneMethode {
    //1. Fall: Prozedur ohne Rückgabe und ohne Übergabeparameter
    public static void Begrüße() { // "void", d.h. kein Rückgabewert
        System.out.println(":) :) :) :) :) :) :):):) :) :) :) :) :) :) :)");
        System.out.println("  *** - Hallo, mein Lieblings-Mensch! - ***");
        System.out.println("---------------------------------------------");
    }
    //2. Fall: Prozedur mit Rückgabe und Übergabeparametern
    public static int Rechne(String w, int a) {
    // "int", d.h. eine Integer-Zahl wird zurückgegeben
    //(String w, int a), d.h. die Methode benötigt einen String und eine Zahl als Eingabewert!
        if (w.equals("zwei")) return a*a;
        else return a*a*a;// "return" zwingend erforderlich – legt den Rückgabewert fest!
    }
    //Hauptprogramm
    public static void main (String args[]) {
        Begrüße(); //Aufruf der Methode mit dem Namen Begrüße();
        Scanner scan = new Scanner(System.in);
        System.out.println("Jetzt wird gerechnet! Welche natürliche Zahl (als Basis)?");
        int x = scan.nextInt();
        System.out.println("Okay - und Exponent 'zwei' oder 'drei'?");
        String exp = scan.next();
        System.out.println("Die Lösung ist " + Rechne(exp,x) + "!");
        //Die Methode Rechne wird mit exp und x aufgerufen und ausgegeben!
    }
}

