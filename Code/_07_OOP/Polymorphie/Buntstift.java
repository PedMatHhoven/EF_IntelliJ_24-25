package _07_OOP.Polymorphie;

class Buntstift extends Stift {
    public Buntstift (String e) {
        schreibfarbe = e;
    }

    public void gibSchreibfarbeAus() {
        System.out.println("Mein Buntstift hat die "
               + "Schreibfarbe " + schreibfarbe + ".");
    }
}
