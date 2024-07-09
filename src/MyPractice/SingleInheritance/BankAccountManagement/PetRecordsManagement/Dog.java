package MyPractice.SingleInheritance.BankAccountManagement.PetRecordsManagement;

public class Dog extends Animal {

    private String breed;

   //  constructor to initialize all variables.
    public Dog(String species, int age, String breed) {
        super(species, age);
        this.breed = breed;
    }
    public String getBreed(){
        return breed;
    }
}
