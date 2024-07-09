package week_13.day_1.practic;

public class Person {
    // Attributes --> variables ---> Fields
    String name;
    int age;
    String address;

    // Unique Properties
    private double salary;
    private String startDate;
    private String endDate;
    private String position;

    // Constructor

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person() {

    }
    // Function --> Methods

   void printPersonInfo(){
       System.out.println("Name:" + name);
       System.out.println("Age:" + age);
       System.out.println("Address:" + address);
   }
   // Getters
    public String getName() {return name;}
    public int getAge() {return age;}
    public String getAddress() {return address;}

    // Getters for Unique Properties
    private double getSalary() {return salary;}
    private String getStartDate() {return startDate;}
    private String getEndDate() {return endDate;}
    private String getPosition() {return position;}

    // Setters
    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}
    public void setAddress(String address) {this.address = address;}

        // Setters for Unique Properties
    private void setSalary(double salary) {this.salary = salary;}
    private void setStartDate(String startDate) {this.startDate = startDate;}
    private void setEndDate(String endDate) {this.endDate = endDate;}
    private void setPosition(String position) {this.position = position;}
}
