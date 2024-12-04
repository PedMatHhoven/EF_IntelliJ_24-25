package _05_Methoden;

import java.util.Scanner;

public class alteMethode_Steigung1 {
    public static double Steigung(double x1, double y1, double x2, double y2) {
        return (y2-y1)/(x2-x1);
    }

    public static void main(String[] args) {
        System.out.println("<<Steigungsberechnung>>");
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie die Koordinaten des ersten Punktes an (x1,y1): ");
        System.out.print("x1:");
        double x1 = scan.nextDouble();
        System.out.print("y1:");
        double y1 = scan.nextDouble();
        System.out.println("Geben Sie die Koordinaten des zweiten Punktes an (x2,y2): ");
        System.out.print("x2:");
        double x2 = scan.nextDouble();
        System.out.print("y2:");
        double y2 = scan.nextDouble();
        System.out.println("Die Steigung der Geraden beträgt " + Steigung(x1,y1,x2,y2) +".");
    }
}
