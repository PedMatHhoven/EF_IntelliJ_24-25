package _05_Methoden;

import java.util.Scanner;

public class alteMethode_Steigung2 {
    public static double Steigung(double xy[]) {
        return (xy[3]-xy[1])/(xy[2]-xy[0]);
    }

    public static double[] Punkte() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie die Koordinaten des 1. Punktes (x1, y1) und dann");
        System.out.println("des 2. Punktes (x2, y2) - in dieser gegebenen Reihenfolge an: ");
        double a[] = new double[4];
        for (int i = 0; i < 4; i++) a[i] = scan.nextDouble();
        return a;
    }

    public static void main(String[] args) {
        System.out.println("<<Steigungsberechnung>>");
        System.out.println("Die Steigung der Grade beträgt " + Steigung(Punkte()) +".");
    }
}
