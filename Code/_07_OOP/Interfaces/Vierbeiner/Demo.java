package _07_OOP.Interfaces.Vierbeiner;

import java.util.Scanner;

public class Demo {
  public static void neustart(){
    System.out.println("Wollen sie neustarten?[true; false]");
    Scanner a =  new Scanner(System.in);
    boolean n = a.nextBoolean();
    if (n == true){
      main(null);
    }else{
      System.out.println("Das ist das ENDE!");
    } 
  }
  
  public static void main(String[] args){
    System.out.println("Wollen sie eine Katze[ka], einen Esel[es] oder einen Elefanten[el] betrachten?");
    Scanner a = new Scanner(System.in);
    String wunsch = a.nextLine();
    if (wunsch.equals("ka")){
      System.out.println("Wie heißt ihre Katze?");
      Scanner b = new Scanner(System.in);
      String name = b.nextLine();
      Katze katze = new Katze(name);
      System.out.println("Was soll " + katze.getName() + " machen? [rennen; springen; knuddeln; jagen]");
      Scanner c = new Scanner(System.in);
      String handlung = c.nextLine();
      if (handlung.equals("rennen")){
        katze.rennen(katze.getName());
      }else if (handlung.equals("springen")){
        katze.springen(katze.getName());
      }else if (handlung.equals("knuddeln")){
        katze.knuddelMich();
      }else if (handlung.equals("jagen")){
        katze.aufZurJagd();
      }else{
        System.out.println("Error 001");
        neustart();
      }
    }else if(wunsch.equals("es")){
      System.out.println("Wie heißt ihr Esel?");
      Scanner b = new Scanner(System.in);
      String name = b.nextLine();
      Esel esel = new Esel(name);
      System.out.println("Was soll " + esel.getName() + " machen? [rennen; springen; tragen]");
      Scanner c = new Scanner(System.in);
      String handlung = c.nextLine();
      if (handlung.equals("rennen")){
        esel.rennen(esel.getName());
      }else if (handlung.equals("springen")){
        esel.springen(esel.getName());
      }else if (handlung.equals("tragen")){
        esel.trageLast();
      }else{
        System.out.println("Error 002");
        neustart();
      }
    }else if(wunsch.equals("el")){
      System.out.println("Wie heißt ihr Elefant?");
      Scanner b = new Scanner(System.in);
      String name = b.nextLine();
      Elefant elefant = new Elefant(name);
      System.out.println("Was soll " + elefant.getName() + " machen? [rennen; springen; tragen]");
      Scanner c = new Scanner(System.in);
      String handlung = c.nextLine();
      if (handlung.equals("rennen")){
        elefant.rennen(elefant.getName());
      }else if (handlung.equals("springen")){
        elefant.springen(elefant.getName());
      }else if (handlung.equals("tragen")){
        elefant.trageLast();
      }else{
        System.out.println("Error 003");
        neustart();
      }  
    }else{
      System.out.println("Error 000");
      neustart();
    }
    neustart();
  }
}
