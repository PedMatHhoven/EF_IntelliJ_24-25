package _07_OOP.Test.Auto;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner AutoErstellen = new Scanner(System.in);
        System.out.println("Welches Auto möchtest du fahren (Marke, Model, Farbe)");
        String brand = AutoErstellen.next();
        String model = AutoErstellen.next();
        String color = AutoErstellen.next();
        auto userCar = new auto(brand, model, color);
        System.out.println("Dein Auto ist ein " + userCar.getColor() + "er " + userCar.getBrand() + " " + userCar.getModel());
        Scanner Ziel = new Scanner(System.in);
        System.out.println("Wo möchtest du hinfahren?");
        String ReiseZiel = Ziel.next();
        Scanner tanken = new Scanner(System.in);
        System.out.println("Möchtest du davor tanken?");
        String Tanken = tanken.next();
        if (Tanken.equals("ja")) userCar.tanken();
        userCar.fahren();
        Scanner radio = new Scanner(System.in);
        System.out.println("Möchtest du das Radio anschalten");
        String Radio = radio.nextLine();
        if (Radio.equals("ja")) userCar.radioAnmachen();
        Random number1 = new Random();
        Random number2 = new Random();
        if (number1.nextInt(3) == 0 && Tanken.equals("nein")) {
            System.out.println("Dein Tank ist leer. Du kannst nicht weiterfahren.");
        }
        else if (number2.nextInt(5) == 0) {
            System.out.println("Du hattest einen Unfall. Du bist gestorben.");
        }
        else{
            System.out.println("Du bist angekommen.");
        }
    }
}
