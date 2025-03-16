package _07_OOP.Vererbung.Zimmer;

public class Vererbung {
  public static void main(String[] args) {
    Badezimmer EricsZahnputzhöhle = new Badezimmer(new int[]{300,400,50},"Blau", 4);
    System.out.println("EricsZahnputzhöhle:") ;
    System.out.println(EricsZahnputzhöhle.getgroesse());
    System.out.println("Anzahl der Toiletten: " + EricsZahnputzhöhle.getanzahlToilette());
    System.out.println(EricsZahnputzhöhle.getFarbe());
    Badezimmer EricsBadeparadies = new Badezimmer(new int[]{30,40,500},"Rosa", 10);
    System.out.println("\nEricsBadeparadies:") ;
    System.out.println(EricsBadeparadies.getgroesse());
    System.out.println("Anzahl der Toiletten: "+EricsBadeparadies.getanzahlToilette());
    System.out.println(EricsBadeparadies.getFarbe());
    Schlafzimmer EricsSommersuite = new Schlafzimmer(new int[]{300,400,5},"Gelb", 5, 6);
    System.out.println("\nEricsSommersuite:") ;
    System.out.println(EricsSommersuite.getgroesse());
    System.out.println("Anzahl der Betten: "+EricsSommersuite.getanzahlBetten());
    System.out.println("Anzahl der Nachttische: "+EricsSommersuite.getanzahlNachttische());
    System.out.println(EricsSommersuite.getFarbe());
    Schlafzimmer EricsWinterPalast = new Schlafzimmer(new int[]{500,700,800},"Weiss", 1, 8000);
    System.out.println("\nEricsWinterPalast:") ;
    System.out.println(EricsWinterPalast.getgroesse());
    System.out.println("Anzahl der Betten: "+EricsWinterPalast.getanzahlBetten());
    System.out.println("Anzahl der Nachttische: "+EricsWinterPalast.getanzahlNachttische());
    System.out.println(EricsWinterPalast.getFarbe());
    Schlafzimmer EricsFruehlingssaal = new Schlafzimmer(new int[]{100,600,50},"Beige", 5, 10);
    System.out.println("\nEricsFruehlignssaal:") ;
    System.out.println(EricsFruehlingssaal.getgroesse());
    System.out.println("Anzahl der Betten: "+EricsFruehlingssaal.getanzahlBetten());
    System.out.println("Anzahl der Nachttische: "+EricsFruehlingssaal.getanzahlNachttische());
    System.out.println(EricsFruehlingssaal.getFarbe());
    Schlafzimmer EricsHerbstresidenz = new Schlafzimmer(new int[]{250,250,10},"Orange", 10, 20);
    System.out.println("\nEricsHerbstresidenz:") ;
    System.out.println(EricsHerbstresidenz.getgroesse());
    System.out.println("Anzahl der Betten: "+EricsHerbstresidenz.getanzahlBetten());
    System.out.println("Anzahl der Nachttische: "+EricsHerbstresidenz.getanzahlNachttische());
    System.out.println(EricsHerbstresidenz.getFarbe());
    Esszimmer EricsSchmausekabinett = new Esszimmer(new int[] {50,100,20}, "Tuerkis", 10, 50, 10);
    System.out.println("\nEricsSchmausekabinett:") ;
    System.out.println(EricsSchmausekabinett.getgroesse());
    System.out.println("Anzahl der Tische:"+EricsSchmausekabinett.getanzahlTische());
    System.out.println("Anzahl der Stuehle:"+EricsSchmausekabinett.getanzahlStuehle());
    System.out.println("Anzahl der Zimmerpflanzen:"+EricsSchmausekabinett.getanzahlZimmerpflanzen());
    System.out.println(EricsSchmausekabinett.getFarbe());
    Wohnzimmer EricsExistenzReich = new Wohnzimmer(new int[] {500,300,30}, "Pink-Rosa", 5, 10, 4);
    System.out.println("\nEricsExistenzReich:");
    System.out.println(EricsExistenzReich.getgroesse());
    System.out.println("Anzahl der Fernseher:"+EricsExistenzReich.getanzahlFernseher());
    System.out.println("Anzahl der Couches:"+EricsExistenzReich.getanzahlCouch());
    System.out.println(EricsExistenzReich.getFarbe());   
  } // end of main
} // end of class Vererbung
