package _07_OOP.Interfaces.Vierbeiner;

public class Elefant extends Vierbeiner implements Nutztier {
  public Elefant(String name) {
    super(name);
  }
  
  public void rennen(String name){
    System.out.println(name + " trampelt los!");
  }
  
  public void springen(String name){
    System.out.println(name + " fliegt los wie Dumbo es vorgemacht hat!");
  }
  
  public void trageLast(){
    System.out.println(name + " trägt zehn Menschen, 50kg Nahrungsmittel und zieht zwei Baumstämme!");
  }
}
