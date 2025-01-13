package _07_OOP;

public class Buch {
    //Attribute
    private int Seitenzahl;
    private String Titel, Autor;

    //Methoden
    //Konstruktor (gleicher Name wie Klasse)
    public Buch(int seitenzahl, String titel, String autor) {
        Seitenzahl = seitenzahl;
        Titel = titel;
        Autor = autor;
    }
    //setter = set-Methode
    public void setTitel(String titel) {
        Titel = titel;
    }
    //getter = get-Methode
    public String getTitel() {
        return Titel;
    }
    //kreative Extra-Methode - noch nicht fertig
    public int Lesedauer(String name) {
        return 0;
    }
}
