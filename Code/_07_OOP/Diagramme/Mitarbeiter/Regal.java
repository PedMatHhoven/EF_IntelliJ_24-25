package _07_OOP.Diagramme.Mitarbeiter;

public class Regal {
  private String standort;
  private Ware inhaltfach01;
  private Ware inhaltfach02;
  private Ware inhaltfach03;

  public Regal(String pStandort) {
    standort = pStandort;
  }

  public String getStandort() {
    return standort;
  }

  public void wareAufnehmen(int pFach, Ware pWare) {
    if (pFach == 1) {
      inhaltfach01 = pWare;
    }
    else if (pFach == 2) {
      inhaltfach02 = pWare;
    }
    else if (pFach == 3) {
      inhaltfach03 = pWare;
    }
  }
}
