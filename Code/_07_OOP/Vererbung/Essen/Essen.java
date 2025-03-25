package _07_OOP.Vererbung.Essen;

class Essen {
    protected String name;
    protected int kalorien;

    public Essen(String name, int kalorien) {
        this.name = name;
        this.kalorien = kalorien;
    }

    public void essen() {
        System.out.println(name + " wird gegessen. Es hat " + kalorien + " Kalorien.");
    }
}