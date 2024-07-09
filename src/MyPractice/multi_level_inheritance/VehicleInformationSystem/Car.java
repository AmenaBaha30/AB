package MyPractice.multi_level_inheritance.VehicleInformationSystem;

public class Car extends Vehicle {
    private final int numberOfDoors;

    // constructor to initialize all variables, including those in the base class.

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    // method
    public int getNumberOfDoors() {return numberOfDoors;}
}