package MyPractice.SingleInheritance.BankAccountManagement.VehicleManagementSystem;

public class Runner {
    public static void main(String[] args) {
        Car car = new Car("BMW", "2024", 4);
        System.out.println("Make:" + car.getMake());
        System.out.println("Model:" + car.getModel());
        System.out.println("Number Of Doors:" + car.getNumberOfDoors());
    }
}
