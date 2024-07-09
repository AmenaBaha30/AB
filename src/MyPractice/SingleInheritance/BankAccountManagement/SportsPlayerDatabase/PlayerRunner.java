package MyPractice.SingleInheritance.BankAccountManagement.SportsPlayerDatabase;

public class PlayerRunner {
    public static void main(String[] args) {
        BasketballPlayer basketballPlayer = new BasketballPlayer("Amena", " shaheen ",  30);
        System.out.println(" Name:" + basketballPlayer.getName() );
        System.out.println(" team:" + basketballPlayer.getTeam() );
        System.out.println(" Point Scored:" + basketballPlayer.getPointsScored() );
    }
}
