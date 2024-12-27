package _06_String;

import java.util.Scanner;

public class wortumdreher {
    public static String drehUm(String s) {
        String umgedreht = "";
        int laenge = s.length();
        for (int i  = laenge - 1; i >= 0; i-=1) {
            umgedreht += s.charAt(i);
            System.out.println(umgedreht); //(mit Zwischenschritten)
        }
        return umgedreht;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        System.out.println("Gib eine Zeichenkette ein:");
        String Kette = scanner.nextLine();
        System.out.println(drehUm(Kette));
    }
}