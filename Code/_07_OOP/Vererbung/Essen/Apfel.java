package _07_OOP.Vererbung.Essen;

class Apfel extends Obst {
    private String sorte;

    public Apfel(String sorte, int kalorien, boolean istSaisonal) {
        super("Apfel", kalorien, istSaisonal);
        this.sorte = sorte;
    }

    public void schälen() {
        System.out.println("Der " + sorte + " Apfel wird geschält.");
    }
}