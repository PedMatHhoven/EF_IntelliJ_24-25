package _07_OOP.Polymorphie.Aufgabe1;

public class Schokoladentafel extends Lebensmittel {
    protected double Kakaogehalt;
    protected String Sorte;

    public Schokoladentafel(double preis, int anzahl, int maxLagerTemperatur, String verfallDatum, double kakaogehalt, String sorte){
        super(preis, anzahl, maxLagerTemperatur, verfallDatum);
        Kakaogehalt = kakaogehalt;
        Sorte = sorte;
    }

    public double getKakaogehalt() {
        return Kakaogehalt;
    }
    public String getSorte() {
        return Sorte;
    }

    public void gebeAus() {
        System.out.println(getSorte() + " hat einen Kakaogehalt von " + getKakaogehalt() + ".");
        super.gebeAus();
    }
}
