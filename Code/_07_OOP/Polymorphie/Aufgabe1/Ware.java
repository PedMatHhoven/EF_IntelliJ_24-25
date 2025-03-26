package _07_OOP.Polymorphie.Aufgabe1;

public class Ware {
    private double Preis;
    private int Anzahl;

    public Ware(double preis, int anzahl) {
        Preis = preis;
        Anzahl = anzahl;
    }

    public double getPreis() {
        return Preis;
    }
    public void setPreis(double preis) {
        Preis = preis;
    }
    public int getAnzahl() {
        return Anzahl;
    }
    public void setAnzahl(int anzahl) {
        Anzahl = anzahl;
    }

    public void gebeAus() {
        System.out.println("Die Ware ist " + Anzahl + " Mal vorhanden und kostet " + Preis + " €!");
        System.out.println();
    }
}
