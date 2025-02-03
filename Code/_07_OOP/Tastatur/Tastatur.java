package _07_OOP.Tastatur;

public class Tastatur {
    private String farbe, keycaps, switches;
    private int Prozent;
    private double kosten;

    public Tastatur(String farbe, String keycaps, String switches, int tasten, double kosten){
        this.farbe = farbe;
        this.Prozent = tasten;
        this.kosten = kosten;
        this.keycaps = keycaps;
        this.switches = switches;
    }
    //get
    public String getFarbe() {
        return farbe;
    }
    public int getProzent() {
        return Prozent;
    }
    public double getKosten() {
        return kosten;
    }
    public String getKeycaps() {
        return keycaps;
    }
    public String getSwitches() {
        return switches;
    }
    //set
    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
    public void setProzent(int prozent) {
        this.Prozent = prozent;
    }
    public void setKosten(double kosten) {
        this.kosten = kosten;
    }
    public void setKeycaps(String keycaps) {
        this.keycaps = keycaps;
    }
    public void setSwitches(String switches) {
        this.switches = switches;
    }
}
