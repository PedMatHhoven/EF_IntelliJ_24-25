package _03_VerzweigungenSchleifen;

import java.util.Scanner;

public class Quadrat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib ein Zeichen ein:");
        String b = scanner.nextLine();
        System.out.print("Gib die Seitenlänge des Quadrats ein: ");
        int a = scanner.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}