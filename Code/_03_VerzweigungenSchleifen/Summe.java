package _03_VerzweigungenSchleifen;

import java.util.Scanner;

public class Summe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("<<Summe>>");
        System.out.print("Geben Sie ein Maximum ein: ");
        int max = scan.nextInt();
        int summe = 0;
        for (int i=1; i<=max; i++){
            summe = summe + i;
            System.out.println(summe);
        }
        System.out.println("Summe: "+summe);
    }
}
