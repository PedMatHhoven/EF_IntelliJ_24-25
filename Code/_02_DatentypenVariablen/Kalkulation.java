package _02_DatentypenVariablen;

import java.util.Scanner;

public class Kalkulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie den Einkaufspreis ein: ");
        double einkaufspreis = scanner.nextDouble();

        double handlungskostenZuschlag = einkaufspreis * 0.40;
        double selbstkostenpreis = einkaufspreis + handlungskostenZuschlag;

        double gewinnZuschlag = selbstkostenpreis * 0.05;
        double nettoVerkaufspreis = selbstkostenpreis + gewinnZuschlag;

        double mehrwertsteuer = nettoVerkaufspreis * 0.19;
        double bruttoVerkaufspreis = nettoVerkaufspreis + mehrwertsteuer;

        System.out.println("\n--- _02_DatentypenVariablen.Kalkulation ---");
        System.out.println("Einkaufspreis: " + einkaufspreis + " EUR");
        System.out.println("+ 40% Handlungskostenzuschlag: " + handlungskostenZuschlag + " EUR");
        System.out.println("= Selbstkostenpreis: " + selbstkostenpreis + " EUR");
        System.out.println("+ 5% Gewinnzuschlag: " + gewinnZuschlag + " EUR");
        System.out.println("= Nettoverkaufspreis: " + nettoVerkaufspreis + " EUR");
        System.out.println("+ 19% Mehrwertsteuer: " + mehrwertsteuer + " EUR");
        System.out.println("= Bruttoverkaufspreis: " + bruttoVerkaufspreis + " EUR");
    }
}