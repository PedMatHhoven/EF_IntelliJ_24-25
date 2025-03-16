package _07_OOP.Vererbung.Lebewesen;

public abstract class Lebewesen {
     protected String Name;
     protected int Alter;
     
     public Lebewesen(String name, int alter){
          Name = name;
          Alter = alter;
     }
     public void setName(String name){
          Name = name;
     }
     public String getName() {
          return Name;
     }
     public void setAlter(int alter){
          Alter = alter;
     }
     public int getAlter() {
          return Alter;
     }
}
