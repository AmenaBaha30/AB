package MyPractice.SingleInheritance.BankAccountManagement.SportsPlayerDatabase;

public class Player {
    private final String name;
    private final String team;

    // Constructor to initialize these variables.
    public Player(String name, String team) {
        this.name = name;
        this.team = team;
    }
    public String getName(){
        return name;
    }
    public String getTeam(){
        return team;
    }


}






 /*
    Project: Sports Player Database

Objective: Demonstrate single inheritance with a sports theme.

Steps:

    1. Create a base class called Player.
    2. Define private member variables: name (type String) and team (type String).
    3. Provide a constructor to initialize these variables.
    4. Implement public methods getName() and getTeam() to access these variables.
    5. Create a derived class called BasketballPlayer that extends Player.
    6. Add a private member variable: pointsScored (type int).
    7. Provide a constructor to initialize all variables.
    8. Implement public method getPointsScored() to access the points scored.
    9. In a main method, create a BasketballPlayer object and display all the details.
  */