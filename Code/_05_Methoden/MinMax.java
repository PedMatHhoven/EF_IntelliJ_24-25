package _05_Methoden;

import java.util.Random;

public class MinMax {
    public static int GenNum() {
        Random rand = new Random();
        return rand.nextInt(1000);
    }

    public static int[] GenArray(){
        int[] Array = new int[10];
        for (int i = 0; i < Array.length; i++) Array[i] = GenNum();
        return Array;
    }

    public static void PrintArray(int[] Array) {
        for (int i = 0; i < Array.length; i++) System.out.print(Array[i] + " ");
    }

    public static int[] MinMaxArray(int[] Array){
        int min = Array[0];
        int max = Array[0];
        for (int i = 1; i < Array.length; i++) {
            if (Array[i] < min) min = Array[i];
            if (Array[i] > max) max = Array[i];
        }
        return new int[] {min, max};
    }

    public static void main(String[] args) {
        int[] NumArray = GenArray();
        PrintArray(NumArray);
        System.out.println();
        int Mini = MinMaxArray(NumArray)[0];
        int Maxi = MinMaxArray(NumArray)[1];
        System.out.println("Das Minimum des Arrays ist: "+ Mini + " und Maximum: " + Maxi);
    }
}