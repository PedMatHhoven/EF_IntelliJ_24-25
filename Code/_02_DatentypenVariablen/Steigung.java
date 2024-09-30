package _02_DatentypenVariablen;

import java.util.Scanner;

public class Steigung {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("<<Steigungsberechnung>>");

        System.out.println("Geben Sie die Koordinaten des ersten Punktes an (x1, y1): ");
        System.out.print("x1:");
        double x1 = scan.nextDouble();
        System.out.print("y1:");
        double y1 = scan.nextDouble();

        System.out.println("Geben Sie die Koordinaten des zweiten Punktes an (x2, y2): ");
        System.out.print("x2:");
        double x2 = scan.nextDouble();
        System.out.print("y2:");
        double y2 = scan.nextDouble();

        double steigung = (y2-y1)/(x2-x1);

        System.out.println("Die Steigung der Grade beträgt "+steigung+".");
   }
}