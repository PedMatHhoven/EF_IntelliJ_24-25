package _04_Arrays;

import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Gib 7 ganze Zahlen ein: ");
        int[] numbers = new int[7];
        for (int i = 0; i < 7; i++) numbers[i] = scan.nextInt();
        int min = numbers[0];
        int max = min;
        for (int i = 1; i < 7; i++) {
            if (numbers[i] < min) min = numbers[i];
            if (numbers[i] > max) max = numbers[i];
        }
        System.out.println("Zahlen:");
        for(int i = 0; i < 7; i++) System.out.print(numbers[i] + " ");
        System.out.println();
        System.out.println("Kleinste Zahl: " + min);
        System.out.println("Größte Zahl: " + max);
    }
}