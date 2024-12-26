package _05_Methoden;

public class Tarif {
    public static double Tarif1(int minuten) {
        double grundgebuehr = 11.75;
        double kostenProMinute = 0.50;
        return grundgebuehr + minuten * kostenProMinute;
    }

    public static double Tarif2(int minuten) {
        double grundgebuehr = 19.25;
        double kostenProMinute = 0.25;
        return grundgebuehr + minuten * kostenProMinute;
    }

    public static double Tarif3(int minuten) {
        double grundgebuehr = 22.75;
        int freieMinuten = 30;
        double kostenProMinute = 0.375;
        if (minuten <= freieMinuten) return grundgebuehr;
        else return grundgebuehr + (minuten - freieMinuten) * kostenProMinute;
    }

    public static void main(String[] args) {
        System.out.println("Monatsrechnung für verschiedene Gesprächsdauern:");
        System.out.println("Minuten  Tarif 1  Tarif 2  Tarif 3");
        for (int minuten = 10; minuten <= 100; minuten += 10) {
            double kostenTarif1 = Tarif1(minuten);
            double kostenTarif2 = Tarif2(minuten);
            double kostenTarif3 = Tarif3(minuten);
            System.out.println(minuten + " Minuten: " + kostenTarif1 + "€  " + kostenTarif2 + "€  " + kostenTarif3 + "€");
        }
    }
}