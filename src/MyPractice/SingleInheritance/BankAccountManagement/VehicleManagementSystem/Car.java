package MyPractice.SingleInheritance.BankAccountManagement.VehicleManagementSystem;

public class Car extends Vehicle{
     // Define
    private int numberOfDoors;

    // constructor
    public Car(String make, String model, int numberOfDoors) {
        super(make, model);
        this.numberOfDoors = numberOfDoors;
    }
    //method
    public int getNumberOfDoors(){
        return numberOfDoors;
    }
}
