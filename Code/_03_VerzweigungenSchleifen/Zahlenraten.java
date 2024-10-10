package _03_VerzweigungenSchleifen;

import java.util.Random;
import java.util.Scanner;

public class Zahlenraten {
    public static void main(String[] args) {
        System.out.println("<<Zahlenraten>>");
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        double geld = 100;
        boolean run1 = true;

        while (run1){
            int versuche = 0;
            int zahl = rand.nextInt(1, 100+1);
            boolean run2 = true;

            System.out.println("\nWat willste machen?\n1.Zahlenraten\n2.Geld setzen\n3.Quit");
            System.out.print(">");
            int choice = scan.nextInt();

            switch (choice){
                case 1:break;
                case 2:
                    System.out.println("Wie viel mehr Geld wollen sie haben?");
                    int moreMoney = scan.nextInt();
                    geld += moreMoney; break;
                case 3:run1=false;run2=false;break;
            }

            while (run2){
                System.out.println("Geld: "+geld+"\nZahl erraten:");
                System.out.print(">");

                int guess = scan.nextInt();
                versuche++;

                if (guess == zahl){
                    System.out.println("\n**WoW du hast die Zahl erraten und 200.00€ gewonnen!!**\nBenötigte Versuche: "+versuche);
                    geld += 200;
                    run2 = false;
                }
                else if (geld<=0) {
                    System.out.println("Du bist bankrott...");
                    geld += 10;
                    run2 = false;
                }
                else {
                    if (guess<zahl){
                        System.out.println("\nDie gesuchte Zahl ist größer!");
                    }
                    else {
                        System.out.println("\nDie gesuchte Zahl ist kleiner!");
                    }
                }
                geld -= 10;
            }
        }
    }
}
