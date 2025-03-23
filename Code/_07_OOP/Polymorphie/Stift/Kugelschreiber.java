package _07_OOP.Polymorphie.Stift;

class Kugelschreiber extends Stift {
    public Kugelschreiber (String e) {
        schreibfarbe = e;
    }

    public void SchreibWas() {
        System.out.println("Ich bin ein Kugelschreiber.");
    }

    public void gibSchreibfarbeAus() {
        System.out.println("Die Schreibfarbe des "
                + "Kugelschreibers ist " + schreibfarbe + ".");
    }
}
