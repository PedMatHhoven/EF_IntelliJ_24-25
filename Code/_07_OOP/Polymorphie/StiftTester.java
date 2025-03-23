package _07_OOP.Polymorphie;

public class StiftTester {
    public static void main ( String[] args ) {
        Stift irgendeinStift = new Kugelschreiber("blau");
        irgendeinStift.SchreibWas();
        irgendeinStift.gibSchreibfarbeAus();
        irgendeinStift = new Buntstift ("rot");
        irgendeinStift.SchreibWas();
        irgendeinStift.gibSchreibfarbeAus();
    }
}
