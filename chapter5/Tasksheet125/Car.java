package chapter5.Tasksheet125;

/**
 * The Car class represents a specific type of vehicle with an additional attribute:
 * number of doors. It inherits from the Vehicle class.
 */
public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);  // Call to superclass constructor
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * Displays the details of the car, including its make, model, year, and
     * the number of doors.
     */
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
