package _04_Arrays;

import java.util.Scanner;

public class gewuenschterEintrag {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] eintrag = {1, 5, 9, 12, 16, 19, 24, 26, 29, 34, 39, 43, 44, 49, 50, 53, 56, 60,
                        61, 67, 70, 73, 75, 77, 81, 86, 90, 92, 96, 99};
        System.out.println("Gib eine Zahl ein um zu überprüfen ob sie im Array ist (Max. 100): ");
        int wunsch = scan.nextInt();
        boolean gefunden = false;
        for (int a = 0; a < eintrag.length; a++) {
            if (eintrag[a] == wunsch) {
                gefunden = true;
                break;
            }
        }
        if (gefunden) System.out.println("Ihre Zahl ist im Array und lautet: "+ wunsch);
        else System.out.println("Ihre Zahl ist nicht im Array");
    }
}

