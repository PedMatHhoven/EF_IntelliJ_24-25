package _07_OOP.Diagramme.Mitarbeiter;

public class Ware {
  private String name;
  private int artNr;
  
  public Ware(String pName, int pArtNr) {
    name = pName;
    artNr = pArtNr;
  }

  public String getName() {
    return name;
  }

  public int getArtNr() {
    return artNr;
  }
} 
