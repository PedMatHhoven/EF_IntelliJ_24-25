package _07_OOP.Vererbung.Zimmer;

public class Schlafzimmer extends Zimmer {
   // Anfang Attribute
  private int anzahlBetten;
  private int anzahlNachttische;
  // Ende Attribute
  public Schlafzimmer(int[] gr, String fa, int aB, int aN) {
    super(gr, fa);
    anzahlBetten=aB;
    anzahlNachttische=aN;
  }
  // Anfang Methoden
  public int getanzahlBetten(){
    return anzahlBetten;
  }
  public int getanzahlNachttische(){
    return anzahlNachttische;
  }
  public String getFarbe(){
    return "Wandfarbe: "+Farbe ;
  } // end of Schlafzimmer
}