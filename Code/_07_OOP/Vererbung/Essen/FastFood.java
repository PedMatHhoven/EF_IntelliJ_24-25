package _07_OOP.Vererbung.Essen;

class FastFood extends Essen {
    protected boolean istVegetarisch;

    public FastFood(String name, int kalorien, boolean istVegetarisch) {
        super(name, kalorien);
        this.istVegetarisch = istVegetarisch;
    }

    public void checkVegetarisch() {
        if (istVegetarisch) {
            System.out.println(name + " ist vegetarisch.");
        } else {
            System.out.println(name + " enthält Fleisch.");
        }
    }
}