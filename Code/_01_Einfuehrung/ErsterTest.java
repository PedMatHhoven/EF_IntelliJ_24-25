package _01_Einfuehrung;

import java.util.Scanner;

public class ErsterTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Schreibe irgendein Wort:");
        String wort = scan.next();
        System.out.println("Das eingegebene Wort war:" + "-->" + wort + "<--");
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Schreibe eine beliebige Zahl:");
        int zahl = scan.nextInt();
        System.out.println("Deine eingegebene Zahl war:" + "-->" + zahl + "<--");
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
