package _03_VerzweigungenSchleifen;

import java.util.Scanner;

public class warmwerden_ifelse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Gib eine natürliche Zahl ein.");
        int i = scan.nextInt();
        System.out.println("i = " + i);
        if (i > 1) {
            if (i > 3) {
                i = 3;
            }
            else i *= 2;
        }
        System.out.println("i = " + i);
    }
}
