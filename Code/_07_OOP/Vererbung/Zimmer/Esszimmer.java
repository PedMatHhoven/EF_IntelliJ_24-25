package _07_OOP.Vererbung.Zimmer;

public class Esszimmer extends Zimmer {
   // Anfang Attribute
  private int anzahlTische;
  private int anzahlStuehle;
  private int anzahlZimmerpflanzen;
  // Ende Attribute
  public Esszimmer(int[] gr, String fa, int aT, int aS, int aZp) {
    super(gr, fa);
    anzahlTische=aT;
    anzahlStuehle=aS;
    anzahlZimmerpflanzen=aZp;
  }
  public int getanzahlTische(){
    return anzahlTische;
  }
  public int getanzahlStuehle(){
    return anzahlStuehle;
  }
  public int getanzahlZimmerpflanzen(){
    return anzahlZimmerpflanzen;
  }
  public String getFarbe(){
    return "Wandfarbe: "+Farbe ;
  }
}