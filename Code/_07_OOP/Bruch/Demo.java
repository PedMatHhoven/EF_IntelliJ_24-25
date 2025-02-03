package _07_OOP.Bruch;

import java.util.Scanner;

public class Demo {
  public static Scanner s = new Scanner(System.in);
  
  public static void main(String[] args) {
    System.out.println("Geben Sie den Zähler ein");
    int zahler; int nenner; String op; Bruch temp;
    zahler = s.nextInt();
    System.out.println("Geben Sie den Nenner ein");
    nenner = s.nextInt();
    Bruch b = new Bruch(zahler, nenner);
    System.out.println(); System.out.println("Ihr Bruch: "+b.getZaehler()+"/"+b.getNenner()); System.out.println();
    System.out.println("Sie haben folgende mögliche Operationen zur Wahl:");
    System.out.println("add: Addition, sub: Subtthraktion, div: Division, " +
    "mal: Multiplikation, erw: Erweitere, kurz: Kürze, ggt: größter gemeinsamer Teiler, "
    + "kgv: kleinstes gemeinsames Vielfaches, iD: inDezimal, kurzmax: volständig Kürzen, erase: neuer Bruch"); System.out.println();
    Scanner s2 = new Scanner(System.in);
    while (true) { 
      op = s2.nextLine();
      if (op.equals("add")) {
        temp = extraBruch();
        b.addiere(temp); Ausgabe(b);
      } else if(op.equals("sub")){
        temp = extraBruch();
        b.subtrahiere(temp); Ausgabe(b);
      } else if(op.equals("div")){
        temp = extraBruch();
        b.dividiere(temp); Ausgabe(b);
      } else if(op.equals("mal")){
        temp = extraBruch();
        b.multipliziere(temp); Ausgabe(b);
      } else if(op.equals("erw")){
        System.out.println("Um welchen Faktor?");
        b.erweitere(s.nextInt()); Ausgabe(b);
      } else if(op.equals("kurz")){
        System.out.println("Um welchen Faktor?");
        b.kuerze(s.nextInt()); Ausgabe(b);
      } else if(op.equals("ggt")){
        System.out.println(b.ggt());
      } else if(op.equals("kgv")){
        System.out.println(b.kgv());
      } else if(op.equals("iD")){
        System.out.println(b.inDezimal());
      } else if(op.equals("kurzmax")){
        b.kuerzeVoll(); Ausgabe(b);
      } else if(op.equals("erase")) { main(null);
      } System.out.println();
    } 
  }
 
  public static Bruch extraBruch(){
    int locZahler; int locNenner;
    System.out.println();
    System.out.println("Geben Sie einen weiteren Zähler ein");
    locZahler=s.nextInt();
    System.out.println("Geben Sie einen weiteren Nenner ein");
    locNenner=s.nextInt();
    Bruch b = new Bruch(locZahler, locNenner);
    return b;  
  }
  
  public static void Ausgabe(Bruch b) {
    System.out.println(); System.out.println("Ihr neuer Bruch: " + b.getZaehler() + "/" + b.getNenner());
  }
}


