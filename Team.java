public class Team {
    private String name;
    private int goals;

    public Team(String name){
        this.name = name;
        this.goals = 0;
    }

    public String getName(){
        return name;
    }
    public int getGoals(){
        return goals;
    }
    public void addGoals(){
        goals++;
    }
    public void displayInfo(){
        System.out.println(name + " - Goals: " + goals);
    }
}

