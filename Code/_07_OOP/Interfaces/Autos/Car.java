package _07_OOP.Interfaces.Autos;

// ToyotaCorolla implements additional features
class Car extends BaseCar {
    public Car(String b, String m) {
        brand = b;
        model = m;
    }

    public void accelerate() {
        System.out.println(brand + " " + model + " accelerating...");
    }

    public void brake() {
        System.out.println(brand + " " + model + " braking...");
    }

    public void playMusic(String song) {
        System.out.println("Playing music in " + brand + " " + model + ": " + song + "\n");
    }

    public boolean crashTest() {
        System.out.println(brand + " " + model + " undergoing crash test...");
        return true;
    }
}
