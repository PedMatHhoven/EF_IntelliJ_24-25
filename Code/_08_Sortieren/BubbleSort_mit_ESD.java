package _08_Sortieren;

import java.util.Random;

public class BubbleSort_mit_ESD {
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

    public static int[] bubblesort(int[] toSort) {
        //"einfache" Version - immer gleich viele Durchläufe
        //und Vergleich aller Zahlen in jedem Durchlauf!
        int temp;
        for(int i=1; i<toSort.length; i++) {
            System.out.println("i = " + i);
            for(int j=1; j<toSort.length; j++) {
                System.out.println("j = " + j);
                System.out.println("toSort[j-1]>toSort[j]?, d.h." + toSort[j-1] + ">" + toSort[j] + "?");
                if(toSort[j-1]>toSort[j]) {
                    System.out.println("ja - tauschen");
                    temp=toSort[j-1]; System.out.println("temp = " + temp);
                    toSort[j-1]=toSort[j]; System.out.println("toSort[j-1] = toSort[j] = " + toSort[j-1]);
                    toSort[j]=temp; System.out.println("toSort[j] = temp = " + temp);
                    System.out.print("Zwischenstand: ");
                    for(int k=0; k<toSort.length; k++) System.out.print(toSort[k] + ", ");
                    System.out.println();
                } else System.out.println("nein");

            }
        }
        return toSort;
    }
}
