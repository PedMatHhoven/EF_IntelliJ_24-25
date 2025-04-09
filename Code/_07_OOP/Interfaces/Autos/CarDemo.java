package _07_OOP.Interfaces.Autos;

// Main class to demonstrate the functionality of different car models
class CarDemo {
    public static void main(String[] args) {
        // Create instances of different car models and test their features
        Car civic = new Car("Honda", "Civic");
        Car corolla = new Car("Toyota", "Corolla");

        // Test basic controls
        System.out.println("Testing " + civic.brand + " " + civic.model + ":");
        civic.accelerate();
        civic.playMusic("Bohemian Rhapsody - Queen");

        System.out.println("Switching to " + corolla.brand + " " + corolla.model + ":");
        corolla.brake();
    }
}
