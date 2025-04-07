package _07_OOP.Interfaces.Vierbeiner;

public class Esel extends Vierbeiner implements Nutztier {
  public Esel(String name) {
    super(name);
  }
  
  public void rennen(String name){
    System.out.println(name + " rennt los!");
  }
  
  public void springen(String name){
    System.out.println(name + " springt wie wild im Kreis!");
  }
  
  public void trageLast(){
    System.out.println(name + " trägt das Getreide!");
  }
}
