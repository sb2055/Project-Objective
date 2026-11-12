public class Match {
    public static String sportName = "Soccer";
    public static int matchesPlayed = 0;

    private Team team1;
    private Team team2;

    public Match(Team team1, Team team2){
        this.team1 = team1;
        this.team2 = team2;
        matchesPlayed++;
    }

    public static void showSport(){
        System.out.println("Sport: " + sportName);
    }

    public String getResult(){
        if (team1.getGoals() > team2.getGoals()) {
            return "Winner: " + team1.getName();
        }else if (team2.getGoals() > team1.getGoals()) {
            return "Winner: " + team2.getName();
        } else {
            return "It's a tie!";
        }
    }
    public void showScoreboard(){
    System.out.println("\n=== FINAL SCOREBOARD ===");
    team1.displayInfo();
    team2.displayInfo();
    System.out.println(getResult());
    System.out.println("Matches played: " + matchesPlayed);
    }
}
