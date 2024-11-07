package _03_VerzweigungenSchleifen;

public class Primzahl {
    public static void main(String[] args) {
        System.out.println("Primzahlen: ");
        System.out.println("2");
        int zahl;
        int zaehler;
        boolean primzahl;
        for (zahl = 2; zahl <= 100; zahl++) {
            primzahl = true;
            for (zaehler = 2; zaehler < Math.sqrt(zahl) + 1; zaehler++) {
                if (zahl % zaehler == 0) {
                    primzahl = false;
                    break;
                }
            }
            if (primzahl) {
                System.out.println(zahl);
            }
        }
    }
}