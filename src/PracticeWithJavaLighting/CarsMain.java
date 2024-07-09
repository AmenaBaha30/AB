package PracticeWithJavaLighting;

public class CarsMain {
    public static void main(String[] args) {
        Cars cars = new Cars("BMW", "Mustang");
        Cars cars1 = new Cars("Ford", "Camere");
        cars1.setMake("Jeep");
        cars1.setModel("Toyota");

        System.out.println(cars1.getMake());
        System.out.println(cars1.getModel());

    }

}
