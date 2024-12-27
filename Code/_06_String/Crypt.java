package _06_String;

import java.util.Scanner;

public class Crypt {
    public static String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String InputMessage(Scanner scanner){
        System.out.print("Nachricht: ");
        return scanner.nextLine();
    }

    public static int KeyCrypt(Scanner scanner){
        System.out.print("Schlüssel: ");
        return scanner.nextInt();
    }

    public static String Caesar(String Message, int Key){
        Message = Message.toUpperCase();
        char[] CryptMessage = Message.toCharArray();
        for (int i = 0; i < Message.length(); i++){
            int idx = Alphabet.indexOf(CryptMessage[i]) + Key;
            if (idx > 25) idx -= 25;
            CryptMessage[i] = Alphabet.charAt(idx);
        }
        return new String(CryptMessage);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Message = InputMessage(scan);
        int Key = KeyCrypt(scan);
        String CryptMessage = Caesar(Message, Key);
        System.out.println("Verschlüsselte Nachricht: " + CryptMessage);
    }
}
