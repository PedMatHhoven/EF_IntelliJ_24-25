package _07_OOP.Interfaces.Autos;

// Abstract base class for all cars implementing common interfaces
abstract class BaseCar implements CarControls, EntertainmentSystem {
    protected String brand;
    protected String model;

    public abstract boolean crashTest();
}
