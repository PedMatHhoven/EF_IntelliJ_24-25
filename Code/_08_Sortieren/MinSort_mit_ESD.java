package _08_Sortieren;

import java.util.Arrays;

public class MinSort_mit_ESD {
    static String green = "\u001B[32m";
    static String colorReset = "\u001B[0m";

    public static void main(String[] args) {
        int[] arr = new int[] { 8, 5, 3, 1 };
        System.out.println(Arrays.toString(arr));
        int[] sorted = SelectionSort(arr);
        System.out.println(Arrays.toString(sorted));
    }

    static int[] SelectionSort(int[] arr) {
        //nicht ganz identisch zu anderem MinSort, aber sehr nah dran!
        for (int i = 0; i < arr.length; i++) {
            System.out.println("i: " + i);
            int minPos = MinimumPosition(i, arr);
            if (minPos == i) // Nicht effizienter, aber besser für Übersicht
                return arr;
            System.out.println("Minimum: " + arr[minPos]);
            System.out.println("Tausche " + arr[minPos] + " mit " + arr[i]);
            Swap(minPos, i, arr);
            System.out.println("Zwischenstand: " + ToStringHighlight(arr, new int[] { minPos, i }));
            System.out.println("----------------");
        }
        return arr;
    }

    static int MinimumPosition(int from, int[] arr) {
        System.out.println("\t----------------");
        int minPos = from;
        System.out.println("\tminPos = " + minPos); // \t = tab
        for (int i = from + 1; i < arr.length; i++) {
            System.out.println("\ti: " + i);
            System.out.print("\t" + arr[i] + " < " + arr[minPos] + "?");
            System.out.print(arr[i] < arr[minPos] ? " Ja!" : " Nö!");
            if (arr[i] < arr[minPos]) {
                minPos = i;
                System.out.println("\n\t\talso minPos = " + minPos);
            }
            else System.out.println();
            System.out.println("\t----------------");
        }
        return minPos;
    }

    static void Swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static String ToStringHighlight(int[] arr, int[] highlights) {
        //"Spielerei" zur schönere Ausgabe
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            if (ArrayContains(highlights, i)) {
                str += green + arr[i] + colorReset;
                continue;
            }
            str += arr[i];
        }
        return str;
    }

    static boolean ArrayContains(int[] arr, int element) {
        //gehört auch zur "Spielerei" oben
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element)
                return true;
        }
        return false;
    }
}
