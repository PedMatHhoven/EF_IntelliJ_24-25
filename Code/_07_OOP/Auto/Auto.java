package _07_OOP.Auto;

public class Auto {
    //Attribute
    private int Tueren, PS;
    private String Name ,Farbe, Besitzer;

    //Konstruktor
    public Auto(int tueren, int ps, String name, String farbe, String besitzer) {
        Name = name;
        PS = ps;
        Tueren = tueren;
        Farbe = farbe;
        Besitzer = besitzer;
    }

    //setter = set-Methoden
    public void setName(String name) {
        Name = name;
    }
    public void setTueren(int tueren) {
        Tueren = tueren;
    }
    public void setFarbe(String farbe) {
        Farbe = farbe;
    }
    public void setBesitzer(String besitzer) {
        Besitzer = besitzer;
    }
    public void setPS(int ps) {
        PS = ps;
    }

    //getter = get-Methoden
    public String getName() {
        return Name;
    }

    public int getPS() {
        return PS;
    }

    public int getTueren() {
        return Tueren;
    }

    public String getBesitzer() {
        return Besitzer;
    }

    public String getFarbe() {
        return Farbe;
    }

    //kreative Extra-Methoden
    public void tunen() {
        setPS(getPS() + 100);
        System.out.println("Dein Auto wurde getuned. Neuer PS Stand: " + getPS() + " PS");
    }

    public void lackieren() {
        setFarbe("Rot");
        System.out.println("Dein Auto ist jetzt " + getFarbe());
    }
}