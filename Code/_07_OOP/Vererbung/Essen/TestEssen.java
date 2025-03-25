package _07_OOP.Vererbung.Essen;

public class TestEssen {
    public static void main(String[] args) {
        Apfel meinApfel = new Apfel("Pink Lady", 52, true);
        meinApfel.essen();
        meinApfel.schälen();
        meinApfel.checkSaison();

        Burger meinBurger = new Burger(500, false, "Rindfleisch");
        meinBurger.essen();
        meinBurger.checkVegetarisch();
        meinBurger.zeigeFleischArt();
    }
}
