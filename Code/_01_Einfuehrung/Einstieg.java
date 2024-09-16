package _01_Einfuehrung;

import java.util.Scanner;
public class Einstieg {

    public static void main(String[] args){
        int kialter = 50;
        Scanner scan = new Scanner(System.in);
        System.out.println("Hallo!");
        System.out.println("Wie geht es dir?");
        String word = scan.next();
        System.out.println("Super - Dir geht es " + word + ". Und wie heißt Du?");
        String name = scan.next();
        System.out.println("Freut mich Dich kennenzulernen, " + name + ".");
        System.out.println("Wie alt bist Du denn, " + name + " ?");
        int alter = scan.nextInt();
        System.out.println("Cool. Ich bin " + kialter + " Jahre alt.");
        int altersunterschied = kialter - alter;
        System.out.println("Wir haben einen Altersunterschied von " + altersunterschied + " Jahren.");
    }
}
