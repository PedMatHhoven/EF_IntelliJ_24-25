package _07_OOP.Bruch;

public class Bruch {
  // Anfang Attribute
   private int Zaehler;
   private int Nenner;
  // Ende Attribute
   
   public Bruch(int z, int n) {
       Zaehler = z;
       Nenner = n;
   }
  // Anfang Methoden
    
   public void setZaehler(int z) {
       Zaehler = z;
   }
   
   public int getZaehler() {
       return Zaehler;
   }
   
   public void setNenner(int n) {
       Nenner = n;
   }
   
   public int getNenner() {
       return Nenner;
   }
   
   public void erweitere(int x) {
       Zaehler *= x;
       Nenner *= x;
   }
   
   public void kuerze(int x) {
       if ((Zaehler % x == 0) && (Nenner % x == 0)) {
         Zaehler /= x;
         Nenner /= x;
       }
   }
   
   public void addiere(Bruch b) {
       Zaehler = Zaehler * b.getNenner() + Nenner * b.getZaehler();
       Nenner = Nenner * b.getNenner();
   }
   
   public void subtrahiere(Bruch b) {
       Zaehler = Zaehler * b.getNenner() + Nenner * b.getZaehler();
       Nenner = Nenner * b.getNenner();  
   }
   
   public void multipliziere(Bruch b) {
       Zaehler = Zaehler * b.getZaehler();
       Nenner = Nenner * b.getNenner();
   }
   
   public void dividiere(Bruch b) {
       Zaehler = Zaehler * b.getNenner();
       Nenner = Nenner * b.getZaehler();
   }
   
//   public int ggt() {
//      int z = Zaehler;
//      int n = Nenner;
//      int rest = z % n;
//      while (rest != 0) {
//        z = n;
//        n = rest;
//        rest = z%n;
//      }
//      return n;
//   }
   
   public int ggt() {
      int z = Zaehler;
      int n = Nenner;
      while (n != 0) {
          if (z > n) {
            z = z - n;
          } else {
             n = n - z;
          }
      } 
      return z;   
   }
  
//   public int kgv() {
//      return Zaehler * Nenner / ggt();
//   }
   //bringt so direkt für einen Bruch an sich nichts, stattdessen müsste man bei der Addition/ Subtraktion
   //den kgv der beiden Nenner berechnen!
   public int kgv() {
      int z = Zaehler;
      int n = Nenner;
      while (n != z) {
          if (z < n) {
            z = z + Zaehler;
          } else {
             n = n + Nenner;
          }
      } 
      return z;   
   }
  
   public void kuerzeVoll () {
      kuerze(ggt());
   }
  
  public double inDezimal() {
     return (double) Zaehler / (double) Nenner; 
  }
  // Ende Methoden
}
