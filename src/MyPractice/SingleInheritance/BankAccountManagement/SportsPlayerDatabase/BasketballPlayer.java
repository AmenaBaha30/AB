package MyPractice.SingleInheritance.BankAccountManagement.SportsPlayerDatabase;

public class BasketballPlayer extends Player {

    private final int pointsScored;

    // constructor
    public BasketballPlayer(String name, String team, int pointsScored) {
        super(name, team);
        this.pointsScored = pointsScored;
    }
    public int getPointsScored(){
        return pointsScored;
    }
}
