package _06_String;

import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Gib einen Satz ein!\n>");
        String satz = scan.nextLine();
        System.out.print("Welches Satzzeichen willst du finden?\n>");
        String letter = scan.nextLine();
        letter += letter.toUpperCase();
        char[] letterToFind = letter.toCharArray(); // letterToFind = z.B. ['a', 'A'] oder ['b', 'B'] oder ['!', '!']
        int wordCount = countLetter(satz, letterToFind);
        System.out.println("Das Satzzeichen \"" + letterToFind[0] + "\" kommt " + wordCount + " mal vor.");
    }

    public static int countLetter(String satz, char[] letterToFind){
        int wordCount = 0;
        for (int i=0; i<satz.length(); i++){
            Character currentChar = satz.charAt(i);
            if (currentChar.equals(letterToFind[0]) || currentChar.equals(letterToFind[1])) wordCount+=1;
        }
        return wordCount;
    }
}
