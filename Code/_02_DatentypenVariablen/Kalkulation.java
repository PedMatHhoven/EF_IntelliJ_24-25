package _02_DatentypenVariablen;

import java.util.Scanner;

public class Kalkulation {
    public static void main(String[] args) {
        //Variablen
        double handlungskostenzuschlag = 0.40;
        double gewinnzuschlag = 0.05;
        double mehrwertsteuer = 0.19;
        double input;
        //Eingabe
        Scanner scan = new Scanner(System.in);
        System.out.println("Einkaufspreis: ");
        input = scan.nextDouble();
        //Ausgabe
        double selbstkostenpreis = input + (input * handlungskostenzuschlag);
        System.out.println("Selbstkostenpreis: " + selbstkostenpreis);
        double nettoverkaufspreis = selbstkostenpreis + (selbstkostenpreis * gewinnzuschlag);
        System.out.println("Nettoverkaufspreis: " + nettoverkaufspreis);
        double bruttoverkaufspreis = nettoverkaufspreis + (nettoverkaufspreis * mehrwertsteuer);
        System.out.println("Bruttoverkaufspreis: " + bruttoverkaufspreis);
    }
}
