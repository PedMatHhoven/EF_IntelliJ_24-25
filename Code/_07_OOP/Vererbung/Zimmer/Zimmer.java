package _07_OOP.Vererbung.Zimmer;

public class Zimmer {
  // Anfang Attribute
  protected int[] groesse = new int[3];
  protected String Farbe;
  // Ende Attribute
  Zimmer(int[] g, String f){
    groesse[0]= g[0];
    groesse[1]= g[1];
    groesse[2]= g[2];
    Farbe=f;
  }
  // Anfang Methoden
  public String getgroesse(){
    return  ""+groesse[0]+"m breit, " + groesse[1]+"m lang, " + groesse[2]+"m hoch";
  }
  public String getFarbe(){
    return Farbe;
  }
  // Ende Methoden
} // end of Zimmer
