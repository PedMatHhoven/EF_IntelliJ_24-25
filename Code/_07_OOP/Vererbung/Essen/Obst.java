package _07_OOP.Vererbung.Essen;

class Obst extends Essen {
    protected boolean istSaisonal;

    public Obst(String name, int kalorien, boolean istSaisonal) {
        super(name, kalorien);
        this.istSaisonal = istSaisonal;
    }

    public void checkSaison() {
        if (istSaisonal) {
            System.out.println(name + " ist gerade in Saison!");
        } else {
            System.out.println(name + " ist nicht in Saison.");
        }
    }
}