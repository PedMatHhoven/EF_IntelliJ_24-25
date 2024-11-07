package _03_VerzweigungenSchleifen;
import java.util.Scanner;

public class Multiplikationsreihe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben sie eine Zahl ein, von der sie die Multiplikationsreihe wissen wollen:");
        int zahl = scan.nextInt();
        System.out.println("Multiplikationsreihe:\n");
        for (int a = 1; a <= 10; a++) {
            System.out.println(zahl + " * " + a + " = " + zahl*a);
        }
    }
}
