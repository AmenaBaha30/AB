package MyPractice.SingleInheritance.BankAccountManagement.PetRecordsManagement;

public class Animal {
    private String species;
    private int age;

    // Provide a constructor to initialize these variables.
    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }
    public String getSpecies(){
        return species;
    }
    public int getAge() {
        return age;
    }



}
    /*
Project: Pet Records Management

Objective: Utilize inheritance for enhanced class design.

Steps:

1. Create a base class called Animal.
2. Define private member variables: species (type String) and age (type int).
3. Provide a constructor to initialize these variables.
4. Implement public methods getSpecies() and getAge() to access these variables.
5. Create a derived class called Dog that extends Animal.
6. Add a private member variable: breed (type String).
7. Provide a constructor to initialize all variables.
8. Implement public method getBreed() to access the breed.
9. In a main method, create a Dog object and display all the details.
 */