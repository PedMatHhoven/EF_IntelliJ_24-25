package _07_OOP.Vererbung.Zimmer;

public class Badezimmer extends Zimmer {
  // Anfang Attribute
  private int anzahlToiletten;
  // Ende Attribute
  Badezimmer(int[] gr, String fa, int aT) {
    super(gr, fa);
    anzahlToiletten=aT;
  }
  // Anfang Methoden
  public int getanzahlToilette(){
    return anzahlToiletten;
  }
  public String getFarbe(){
    return "Fliesenfarbe: "+Farbe ;
  }
} // end of Badezimmer
