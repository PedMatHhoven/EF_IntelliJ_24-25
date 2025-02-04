package _07_OOP.ErsteEigeneKlassen.Buch;

public class Zugriff {
    public static void main(String[] args) {
        Buch Daniel = new Buch(250,"wadehaddeduddeda","Stefan Raab");
        System.out.println(Daniel.getTitel());
        Daniel.setTitel("WhDd");
        System.out.println(Daniel.getTitel());
    }
}
