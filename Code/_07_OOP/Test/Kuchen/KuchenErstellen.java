package _07_OOP.Test.Kuchen;

import java.util.Scanner;

public class KuchenErstellen {
  public static void main(String[] args) {
    Kuchen Torte = new Kuchen(0, "", "", "", "", "");

    System.out.println("Geben sie die Stockwerke an (1-6)");
    Scanner a = new Scanner(System.in);
    int St = a.nextInt();
    Torte.setStockwerke(St);

    System.out.println("Geben sie die Form an (rund oder viereckig)");
    Scanner k = new Scanner(System.in);
    String f = k.next();
    Torte.setForm(f);

    System.out.println("Geben sie die Boden an");
    Scanner c = new Scanner(System.in);
    String b = c.next();
    Torte.setBoden(b);

    System.out.println("Geben sie die Füllung an");
    Scanner d = new Scanner(System.in);
    String fü = d.next();
    Torte.setFüllung(fü);

    System.out.println("Geben sie die Glasurfarbe an");
    Scanner e = new Scanner(System.in);
    String gf = e.next();
    Torte.setGlasurfarbe(gf);

    System.out.println("Geben sie die Verzierung an");
    Scanner j = new Scanner(System.in);
    String v = j.next();
    Torte.setVerzierung(v);

    System.out.println("");
    System.out.println("-----------------------------------------------------");
    System.out.println("");
    System.out.println("Ihre Angaben sind:");
    System.out.println("Stockwerke: " + Torte.getStockwerke());
    System.out.println("Form: " + Torte.getForm());
    System.out.println("Boden: " + Torte.getBoden());
    System.out.println("Füllung: " + Torte.getFüllung());
    System.out.println("Glasurfarbe: " + Torte.getGlasurfarbe());
    System.out.println("Verzierung: " + Torte.getVerzierung());
  }
}
