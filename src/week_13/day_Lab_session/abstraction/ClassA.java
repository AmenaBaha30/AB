package week_13.day_Lab_session.abstraction;

    public abstract class ClassA {

        String firstName;
        String lastName;

        public abstract void print();

        public void printFirstName() {
            System.out.println("FirstName: " + firstName);
        }

    }
