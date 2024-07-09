package MyPractice.SingleInheritance.BankAccountManagement.PetRecordsManagement;

public class Runner {
    public static void main(String[] args) {
        Dog dog = new Dog("act", 3, "milk");
        System.out.println("species: " + dog.getSpecies());
        System.out.println("Age: " + dog.getAge());
        System.out.println(" Breed: " + dog.getBreed());
    }
}
