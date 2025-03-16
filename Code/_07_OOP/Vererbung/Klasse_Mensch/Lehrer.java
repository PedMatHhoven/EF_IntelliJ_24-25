package _07_OOP.Vererbung.Klasse_Mensch;

public class Lehrer extends Mensch {
    private String Schule;
      
    public Lehrer(int g, String h, String schule) {
        super(g,h);
        Schule = schule;  
    }
}
