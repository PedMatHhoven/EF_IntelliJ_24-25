package _08_Sortieren;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int[] meinArray = new int[6];
        Random random = new Random();
        for (int i=0; i<6; i++) meinArray[i] = random.nextInt(100);
        System.out.println("gegebener Array: ");
        for (int i=0; i<meinArray.length; i++) System.out.print(meinArray[i]+", ");
        System.out.println();
        int[] sortiert = bubblesort(meinArray);
        System.out.println("sortierter Array: ");
        for (int i=0; i<sortiert.length; i++) System.out.print(sortiert[i]+", ");
    }

    public static int[] bubblesort(int[] a) {
        //"einfachere" Version - immer gleich viele Durchläufe
        //und Vergleich aller Zahlen in jedem Durchlauf!
        for(int i=0; i<a.length-1; i++) {
            for(int j=1; j<a.length; j++) {
                if(a[j-1]>a[j]) {
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }

            }
        }
        return a;
    }
}
