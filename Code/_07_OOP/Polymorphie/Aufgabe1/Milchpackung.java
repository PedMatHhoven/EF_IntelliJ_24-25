package _07_OOP.Polymorphie.Aufgabe1;

public class Milchpackung extends Lebensmittel {
    protected boolean Hocherhitzt;
    protected String Typ;

    public Milchpackung(double preis, int anzahl, int maxLagerTemperatur, String verfallDatum, boolean hocherhitzt, String typ){
        super(preis, anzahl, maxLagerTemperatur, verfallDatum);
        Hocherhitzt = hocherhitzt;
        Typ = typ;
    }

    public boolean isHocherhitzt() {
        return Hocherhitzt;
    }
    public String getTyp() {
        return Typ;
    }

    public void gebeAus() {
        System.out.println(getTyp() + " ist " + isHocherhitzt() + ".");
        super.gebeAus();
    }
}