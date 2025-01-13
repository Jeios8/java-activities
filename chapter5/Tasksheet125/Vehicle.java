package chapter5.Tasksheet125;

/**
 * The Vehicle class represents a generic vehicle with basic attributes:
 * make, model, and manufacturing year.
 */
public class Vehicle {
    protected String make;
    protected String model;
    protected int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}
