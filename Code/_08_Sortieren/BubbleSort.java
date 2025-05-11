package _08_Sortieren;

import java.util.Random;

public class BubbleSort {
    public static int[] sort(int[] a) {
        for (int i=0; i < a.length-1; i++) {
            for (int j=1; j < a.length; j++) {
                if (a[j-1] > a[j]) {
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] zahlen = new int[8];
        Random random = new Random ();
        System.out.println("zufällige Zahlen: ");
        for (int i=0; i < zahlen.length; i++) {
            zahlen[i] = random.nextInt(1000)+1;
            System.out.print(zahlen[i] + " ");
        }
        System.out.println();
        zahlen = sort(zahlen);
        System.out.println("in sortierter Form:");
        for (int i=0; i < zahlen.length; i++) System.out.print(zahlen[i] + " ");
    }
}