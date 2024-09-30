package _02_DatentypenVariablen;

import java.util.Scanner;

public class Steigung {
    public static void main(String[] args) {
        Scanner x1 = new Scanner(System.in);
        System.out.println("Geben Sie den x1-Wert ein.");
        double x = x1.nextDouble();
        Scanner y1 = new Scanner(System.in);
        System.out.println("Geben Sie den y1-Wert ein.");
        double y = y1.nextDouble();
        Scanner x2 = new Scanner(System.in);
        System.out.println("Geben Sie den x2-Wert ein.");
        double xx = x1.nextDouble();
        Scanner y2 = new Scanner(System.in);
        System.out.println("Geben Sie den y2-Wert ein.");
        double yy = y2.nextDouble();
        double steigung = (yy - y)/(xx - x);
        System.out.println("Die Steigung ist " + steigung + ".");
    }
}

