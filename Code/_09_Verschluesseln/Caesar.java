package _09_Verschluesseln;

import java.util.Scanner;

public class Caesar {

  public static void main (String[] args) {
    System.out.print("Bitte Verschiebung eingeben: ");
    Scanner scan = new Scanner(System.in);
    int shift = scan.nextInt();
    System.out.print("Bitte Text eingeben: ");
    Scanner scan2 = new Scanner(System.in);
    String a = scan2.nextLine();
    char[] text = a.toUpperCase().toCharArray();

    crypt(text, shift);
    System.out.println("Verschlüsselt: " + new String(text));

    System.out.println("entschlüsseln ? j/n");
    Scanner scan3 = new Scanner(System.in);
    String b = scan3.nextLine();
    if (b.equals("j")) {
      crypt(text, -shift);
      System.out.println("Entschlüsselt: " + new String(text));
    }
  }

  private static void crypt(char[] text, int shift){
    for(int i = 0; i < text.length; i++){
      if (text[i] >= 65 && text[i] <= 90) {
        text[i] = (char)(text[i] + shift);
        if(text[i] > 90){
          text[i] -= 26;
        } else if(text[i] < 65){
          text[i] += 26;
        }
      }
    }
  }
}