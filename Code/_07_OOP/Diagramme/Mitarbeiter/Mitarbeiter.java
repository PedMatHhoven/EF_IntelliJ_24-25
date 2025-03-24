package _07_OOP.Diagramme.Mitarbeiter;

public class Mitarbeiter {
  //Attribute
  private String name;
  //Konstruktor
  public Mitarbeiter(String pName) {
    name = pName;
  }
  //getter
  public String getName() {
    return name;
  }
  //weitere Methode
  public void regalEinräumen(Regal pRegal, int pFach, Ware pWare) {
    pRegal.wareAufnehmen(pFach, pWare);
  }
}