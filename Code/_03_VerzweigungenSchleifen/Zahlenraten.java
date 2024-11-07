package _03_VerzweigungenSchleifen;// erste Aufgabe von Verzweigungen und Schleifen

import java.util.Scanner;

public class Zahlenraten {
    public static void main(String[] args) {
        int ran_num = (int)(Math.random() * 100 + 1);
        int usr_num;
        int tries = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Raten sie die Zahl zwischen 1 und 100!");
        while (true){
            System.out.print("Zahl: ");
            usr_num = scan.nextInt();
            if (usr_num == ran_num){
                System.out.println("Dies ist die richtig geratene Zahl!");
                System.out.println("Sie haben " + tries + " Versuche gebraucht.");
                break;
            } else if (usr_num > ran_num) {
                System.out.println("Die Zufallszahl ist kleiner als die eingegebene Zahl");
                tries++;
            } else if (usr_num < ran_num) {
                System.out.println("Die Zufallszahl ist größer als die eingegebene Zahl");
                tries++;
            }
        }
    }
}
