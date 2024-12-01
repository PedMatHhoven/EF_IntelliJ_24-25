package _04_Arrays;

import java.util.Scanner;

public class Notenspiegel {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Gib die Anzahl der Schüler ein,");
        System.out.println("die die Noten haben (1-6):");
        int a[] = new int[6];
        for (int i = 0; i < 6; i++) a[i] = scan.nextInt();
        System.out.println("Notenspiegel");
        Object[][] klassenspiegel = new Object[2][7];
        klassenspiegel[0][0] = "Noten - ";
        klassenspiegel[0][1] = "sehr gut";
        klassenspiegel[0][2] = "gut";
        klassenspiegel[0][3] = "befriedigend";
        klassenspiegel[0][4] = "ausreichend";
        klassenspiegel[0][5] = "mangelhaft";
        klassenspiegel[0][6] = "ungenügend";
        klassenspiegel[1][0] = "Schüler";
        for (int i = 0; i < 6; i++) klassenspiegel[1][i+1] = a[i];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 2; j++) System.out.print(klassenspiegel[j][i] + " ");
            System.out.println();
        }
    }
}
