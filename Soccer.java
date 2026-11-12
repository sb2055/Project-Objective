import java.util.Scanner;

public class Soccer{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Match.showSport();

        System.out.print("Enter first team name: ");
        String name1 = input.nextLine();
        System.out.print("Enter second team name: ");
        String name2 = input.nextLine();

        Team team1 = new Team(name1);
        Team team2 = new Team(name2);
        Match match = new Match(team1, team2);

        int choice = -1;
        while (choice != 0){
            System.out.println("\nWho scored? 1 = " + name1 + ", 2 = " + name2 + ", 0 = Full Time");
            choice = input.nextInt();

            if (choice== 1) {
                team1.addGoals();
            } else if (choice == 2) {
                team2.addGoals();
            }else if (choice !=0){
                System.out.println("Plase enter 0,1 or 2");
            }
        }

        match.showScoreboard();
        input.close();


    }
}

