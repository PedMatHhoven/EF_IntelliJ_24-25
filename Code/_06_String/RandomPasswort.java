package _06_String;

import java.util.Random;
import java.util.Scanner;

public class RandomPasswort {
    public static void main(String[] args) {
        String passwort = "";

        Scanner scan = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        String[] letterChars = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s"
                , "t", "u", "v", "w", "x", "y", "z", "ß"};

        String[] specialChars = {"!", "?", "§", "$", "%", "&", "/", "(", ")", "=", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "{", "[", "]", "}"};

        System.out.println("Wie lang soll ihr Passwort sein?: ");
        int passwortLength = scan.nextInt();
        System.out.println("Sicheres Passwort verwenden? (y/n): ");
        String setSafety = scanner.nextLine();

        int specialCharAmount;
        if (setSafety.equals("y")) specialCharAmount = passwortLength/3;
        else specialCharAmount = 0;

        for (int i=0; i<passwortLength; i++) {
            int randLetterIndex = rand.nextInt(0, letterChars.length);
            int randCharIndex = rand.nextInt(0, specialChars.length);

            if (i>=passwortLength-specialCharAmount) passwort += specialChars[randCharIndex];
            else passwort += letterChars[randLetterIndex];
        }

        System.out.println(passwort);
    }
}
