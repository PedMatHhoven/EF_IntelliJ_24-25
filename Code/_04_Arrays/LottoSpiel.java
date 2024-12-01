package _04_Arrays;

import java.util.*;

public class LottoSpiel { //doppelte Zahlen werden (noch) nicht abgefangen
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] spielerZahlen = new int[6];
        int[] lottoZahlen = new int[6];
        System.out.println("Wähle 6 Zahlen zwischen 1 und 49:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Zahl " + (i + 1) + ": ");
            spielerZahlen[i] = scanner.nextInt();
        }
        Random random = new Random();
        lottoZahlen[0] = random.nextInt(8) + 1;
        for (int i = 1; i < 6; i++) lottoZahlen[i] = lottoZahlen[i-1] + random.nextInt(8) + 1;
        System.out.println("\nLottozahlen: " + Arrays.toString(lottoZahlen));
        int treffer = 0;
        for (int i = 0; i < 6; i++)
            for (int j = 0; j < 6; j++)
                if (spielerZahlen[i] == lottoZahlen[j]) treffer++;
        System.out.println("Du hast " + treffer + " Treffer!");
    }
}