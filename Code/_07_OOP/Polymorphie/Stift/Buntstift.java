package _07_OOP.Polymorphie.Stift;

class Buntstift extends Stift {
    public Buntstift (String e) {
        schreibfarbe = e;
    }

    public void gibSchreibfarbeAus() {
        System.out.println("Mein Buntstift hat die "
               + "Schreibfarbe " + schreibfarbe + ".");
    }
}
