package _05_Methoden;

import java.util.Scanner;

public class Universitaet {
    public static int muendlicheArbeit(int Vortrag) {
        return Vortrag * 2;
    }

    public static int Hausarbeit(int arbeit){
        return arbeit * 3;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Gib deine mündliche Punktzahl ein:");
        int punktmund = scan.nextInt();
        if (punktmund > 10) {
            System.out.println("Deine Punktzahl ist zu hoch, sie wird auf 10 runtergesetzt.");
            punktmund = 10;
        }
        System.out.print("Gib deine Arbeitspunkte an:");
        int arbeit = scan.nextInt();
        if (arbeit > 10) {
            System.out.println("Die Punktzahl ist zu groß, sie wird auf 10 runtergesetzt.");
            arbeit = 10;
        }
        System.out.println("Deine gesamte Punktzahl:" + (muendlicheArbeit(punktmund) + Hausarbeit(arbeit)) + "/50");
    }
}