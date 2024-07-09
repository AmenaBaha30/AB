package MyPractice.multi_level_inheritance.VehicleInformationSystem;

public class Vehicle {
    private final String make;
    private final String model;
    private final int  year;

    // Constructor
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    // methods -->
    public String getMake(){ return make;}
    public String getModel(){ return model;}
    public int getYear (){return year;}

}
