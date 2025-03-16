package _07_OOP.Vererbung.Klasse_Mensch;

public class Schüler extends Mensch {
    private String Schule;
      
    public Schüler(int g, String h, String schule) {
        super(g,h);
        Schule = schule;  
    }

    public void setSchule(String schule) {
        Schule = schule;
    }
    
    public String getSchule() {
        return Schule;
    }
    
    public void schreibeArbeit() {
        Groesse = Groesse - 5;
    }
}
