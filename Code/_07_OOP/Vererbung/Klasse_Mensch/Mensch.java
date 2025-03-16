package _07_OOP.Vererbung.Klasse_Mensch;

public class Mensch {
    protected int Groesse;
    protected String Hautfarbe;
    
    public Mensch(int g, String h) {
       Groesse = g;
       Hautfarbe = h;
    }

   public void setGroesse(int g) {
      Groesse = g;
   }
   
   public int getGroesse() {
      return Groesse;    
   }
   
   public void setHautfarbe(String h) {
      Hautfarbe = h;
   }
   
   public String getHautfarbe() {
      return Hautfarbe;    
   }
   
   public void essen() {
       Groesse = Groesse + 10;
   }
}
