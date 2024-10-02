package _03_VerzweigungenSchleifen;

import java.util.Scanner;

public class warmwerden_switch {
    public static void main(String[] args) {
        System.out.println("Welche Note hast Du geschrieben?");
        Scanner scan = new Scanner(System.in);
        int note = scan.nextInt();
        switch (note) {
            case 1: System.out.println("Sehr gute Arbeit!"); break;
            case 2: System.out.println("gute Arbeit!"); break;
            case 3: System.out.println("zufriedenstellende Arbeit!"); break;
            case 4: System.out.println("ausreichende Arbeit!"); break;
            case 5,6: System.out.println("schlechte Arbeit!"); break;
            case default: System.out.println("Das ist keine bekannte Note!");
        }
    }
}
