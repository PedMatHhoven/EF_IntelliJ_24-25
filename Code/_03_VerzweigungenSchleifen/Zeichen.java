package _03_VerzweigungenSchleifen;

import java.util.Scanner;

public class Zeichen {
    public static void main(String[] args) {
        char var;
        Scanner scan = new Scanner(System.in);
        System.out.print("Geben sie ein Zeichen ein: ");
        var = scan.next().charAt(0);
        if(Character.isDigit(var)){
            System.out.println("Es ist eine Ziffer.");
        } else if (Character.isLetter(var)) {
            System.out.println("Es ist ein Buchstabe.");
        } else{
            System.out.println("Es ist ein sonstiges Zeichen.");
        }

    }
}
