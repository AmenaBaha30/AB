package MyPractice.SingleInheritance.BankAccountManagement.VehicleManagementSystem;

public class Vehicle {
    // Define
    private String make;
    private String model;

    // constructor to initialize these variables.
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }
    // methods
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }

}
/*
    Project: Vehicle Management System

Objective: Understand extending functionality through inheritance.

Steps:

    1. Create a base class called Vehicle.
    2. Define private member variables: make (type String) and model (type String).
    3. Provide a constructor to initialize these variables.
    4. Implement public methods getMake() and getModel() to access these variables.
    5. Create a derived class called Car that extends Vehicle.
    6. Add a private member variable: numberOfDoors (type int).
    7. Provide a constructor to initialize all variables.
    8. Implement public method getNumberOfDoors() to access the number of doors.
    9. In a main method, create a Car object and display all the details.
 */