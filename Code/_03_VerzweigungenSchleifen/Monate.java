package _03_VerzweigungenSchleifen;

import java.util.Scanner;

public class Monate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Gib einen Monat deiner Wahl ein (die Zahl des Monats):");
        int monatszahl = scan.nextInt();
        System.out.println("-----------------------------------------------------------------------------------------");

        switch (monatszahl){
            case 1:
                System.out.println("Monat:Januar | Tage:31");
                break;
            case 2:
                System.out.println("Monat:Februar | Tage:28");
                break;
            case 3:
                System.out.println("Monat:März | Tage:31");
                break;
            case 4:
                System.out.println("Monat:April | Tage:30");
                break;
            case 5:
                System.out.println("Monat:Mai | Tage:31");
                break;
            case 6:
                System.out.println("Monat:Juni | Tage:30");
                break;
            case 7:
                System.out.println("Monat:Juli | Tage:31");
                break;
            case 8:
                System.out.println("Monat:August | Tage:30");
                break;
            case 9:
                System.out.println("Monat:September | Tage:31");
                break;
            case 10:
                System.out.println("Monat:Oktober | Tage:30");
                break;
            case 11:
                System.out.println("Monat:November | Tage:31");
                break;
            case 12:
                System.out.println("Monat:Dezember | Tage:30");
                break;
        }
    }
}
