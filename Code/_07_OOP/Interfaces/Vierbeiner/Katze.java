package _07_OOP.Interfaces.Vierbeiner;

public class Katze  extends Vierbeiner implements Knuddeltier, Jagdtier{
  public Katze(String name){
    super(name);
  }

  public void rennen(String name) {
    System.out.println(name + " rennt los!");
  }
  
  public void springen(String name){
    System.out.println(name + " springt in die Luft!");
  }
  
  public void knuddelMich(){
    System.out.println(name + " wird geknuddelt!");
  }
  
  public void aufZurJagd(){
    System.out.println(name + " geht auf die Jagd!");
  }
}
