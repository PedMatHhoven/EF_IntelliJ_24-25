package _07_OOP.Test.Dreieck;

import java.util.Scanner;

public class MainDreieck {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Koordinaten Punkt A: ");
    System.out.println("X: ");
    int A = scan.nextInt();
    System.out.println("Y: ");
    int B = scan.nextInt();
    System.out.println("Koordinaten Punkt B: ");
    System.out.println("X: ");
    int C = scan.nextInt();
    System.out.println("Y: ");
    int D = scan.nextInt();
    System.out.println("Koordinaten Punkt C: ");
    System.out.println("X: ");
    int E = scan.nextInt();
    System.out.println("Y: ");
    int F = scan.nextInt();
    ClassDreieck Michael = new ClassDreieck(A, B, C, D, E, F);
    System.out.println("Punkt A: (" + A + "/" + B + ")");
    System.out.println("Punkt B: (" + C + "/" + D + ")");
    System.out.println("Punkt C: (" + E + "/" + F + ")");
    System.out.println("SeitenlängeC: "+ Michael.SeitenlängeC());
    System.out.println("SeitenlängeA: "+ Michael.SeitenlängeA());
    System.out.println("SeitenlängeC: "+ Michael.SeitenlängeB());
    System.out.println("Umfang: "+ Michael.Umfang());
    System.out.println("Flächeninhalt: "+ Michael.Flächeninhalt());
  }
}
