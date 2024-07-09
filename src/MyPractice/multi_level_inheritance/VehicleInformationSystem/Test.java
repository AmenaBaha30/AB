package MyPractice.multi_level_inheritance.VehicleInformationSystem;

import java.util.ArrayList;

public class Test {
    public static class Main {
        public static void main(String[] args) {
            ArrayList<String> cars = new ArrayList<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add(2,"Mazda"); // Insert element at the beginning of the list (index 0)

            System.out.println(cars);
        }
    }
}