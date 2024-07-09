package MyPractice.multi_level_inheritance.VehicleInformationSystem;

public class Runner {
    public static void main(String[] args) {
        ElectricCar BMW = new ElectricCar(" BMW", " BMW ", 2023,
                4, 3000 );

        System.out.println("Model:" + BMW.getModel());
        System.out.println("Make:" + BMW.getMake());
        System.out.println("year:" + BMW.getYear());
        System.out.println("NumberOfDoor:" + BMW.getNumberOfDoors());
        System.out.println("BatteryCapacity:" + BMW.getBatteryCapacity()+ " kWh");

    }

}
