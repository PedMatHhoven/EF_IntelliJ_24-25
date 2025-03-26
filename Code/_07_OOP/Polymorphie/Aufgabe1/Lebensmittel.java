package _07_OOP.Polymorphie.Aufgabe1;

public class Lebensmittel extends Ware {
    protected int MaxLagerTemperatur;
    protected String VerfallDatum;

    public Lebensmittel(double preis, int anzahl, int maxLagerTemperatur, String verfallDatum){
        super(preis, anzahl);
        MaxLagerTemperatur = maxLagerTemperatur;
        VerfallDatum = verfallDatum;
    }

    public int getMaxLagerTemperatur() {
        return MaxLagerTemperatur;
    }
    public String getVerfallDatum() {
        return VerfallDatum;
    }
    public void gebeAus() {
        System.out.println("Die maximale Lagertemperatur beträgt " + MaxLagerTemperatur +
                " Grad, das Verfallsdatum ist der " + VerfallDatum + ".");
        super.gebeAus();
    }
}
