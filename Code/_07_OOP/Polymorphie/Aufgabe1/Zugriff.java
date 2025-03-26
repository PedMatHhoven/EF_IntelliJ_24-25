package _07_OOP.Polymorphie.Aufgabe1;

public class Zugriff{
    public static void main(String[] args) {
        Ware milch = new Milchpackung(1.98, 1, 8, "22.04.2022", true, "Die Mandelmilch");
        milch.gebeAus();
        Ware schoko = new Schokoladentafel(1.09, 1, 15, "15.4.2024", 38.0, "Die Oreo-Schokolade");
        schoko.gebeAus();
        Ware moeb = new Möbelstück(35.00, 1, 400, 50, 100, "Das Sofa");
        moeb.gebeAus();
        Ware kleid = new Kleidungsstück(9.99, 1, 38, "T-Shirt", "rot", "Die Baumwolle");
        kleid.gebeAus();
    }
}
