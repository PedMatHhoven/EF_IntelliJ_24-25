package _07_OOP.Interfaces.Vierbeiner;

abstract class Vierbeiner {
  protected String name;
  
  abstract void rennen(String name);
  abstract void springen(String name);
  
  public Vierbeiner(String Name){
    name = Name;
  }
  
  public String getName(){
    return name;
  }
}
