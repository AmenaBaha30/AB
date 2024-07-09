package MyPractice.multi_level_inheritance.VehicleInformationSystem;

public class ElectricCar extends Car {

    private final int batteryCapacity;

    // constructor to initialize all variables, including those in the base class.

    public ElectricCar(String make, String model, int year, int numberOfDoors, int batteryCapacity) {
        super(make, model, year, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
    }

    // method
    public int getBatteryCapacity() {return batteryCapacity;}

    /*
         In the ElectricCar class, override the getModel() method to include
        battery capacity in the model description.
     */
    @Override
    public String getModel() {
        return super.getModel() + " (Battery:" + batteryCapacity + " kwh)";

    }
}