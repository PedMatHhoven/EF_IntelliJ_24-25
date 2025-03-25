package _07_OOP.Vererbung.Essen;

class Burger extends FastFood {
    private String fleischArt;

    public Burger(int kalorien, boolean istVegetarisch, String fleischArt) {
        super("Burger", kalorien, istVegetarisch);
        this.fleischArt = fleischArt;
    }

    public void zeigeFleischArt() {
        System.out.println("Dieser Burger enthält " + fleischArt + ".");
    }
}