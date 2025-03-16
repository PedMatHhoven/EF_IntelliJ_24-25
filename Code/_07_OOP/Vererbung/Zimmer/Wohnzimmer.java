package _07_OOP.Vererbung.Zimmer;

public class Wohnzimmer extends Zimmer {
  // Anfang Attribute
  private int anzahlFernseher;
  private int anzahlCouch;
  private int azahlTische;
  // Ende Attribute
  public Wohnzimmer(int[] gr, String fa, int aF, int aC, int aT) {
    super(gr, fa);
    anzahlFernseher=aF;
    anzahlCouch=aC;
  }
  // Anfang Methoden
  public int getanzahlFernseher(){
    return anzahlFernseher;
  }
  public int getanzahlCouch(){
    return anzahlCouch;
  }
  public String getFarbe(){
    return "Wandfarbe: "+Farbe ;
  } 
} // end of class Wohnzimmer
