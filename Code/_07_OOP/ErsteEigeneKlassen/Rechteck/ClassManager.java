package _07_OOP.ErsteEigeneKlassen.Rechteck;

import java.util.Scanner;

public class ClassManager {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Breite: ");
        int width = scan.nextInt();
        System.out.println("Höhe: ");
        int height = scan.nextInt();
        Vector2Int size = new Vector2Int(width, height);

        Rectangle rec1 = new Rectangle(size);
        System.out.println(rec1.ToString());

        Rectangle rec2 = new Rectangle(size, '+', true, '#');
        System.out.println(rec2.ToString());

        System.out.println("Invertiert:");
        rec2.Invert();
        System.out.println(rec2.ToString());

        System.out.println("Größe verändert +(10, -3):");
        rec2.size.Add(new Vector2Int(10, -3));
        System.out.println(rec2.ToString());
    }
}