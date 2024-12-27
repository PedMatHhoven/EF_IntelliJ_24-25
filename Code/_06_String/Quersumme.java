package _06_String;

import java.util.Scanner;

public class Quersumme {
    public static int Quer(String q) {
        int quersumme = 0;
        for (int i = q.length() - 1; i >= 0; i--) quersumme += q.charAt(i) - '0';
        return quersumme;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Geben sie Zahlen ein, von der sie die Quersumme wollen: ");
        String zahl = scan.nextLine();
        System.out.println("Quersumme = " + Quer(zahl));
    }
}