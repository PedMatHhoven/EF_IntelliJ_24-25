package _07_OOP.Polymorphie;

abstract class Stift {
    String schreibfarbe;

    public void SchreibWas() {
        System.out.println("Ich bin ein Stift. ");
    }

    public abstract void gibSchreibfarbeAus();
}

