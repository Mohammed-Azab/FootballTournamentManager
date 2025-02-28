package core.models;

public class Player{
    private String name;
    private int number;
    private int numOfGoals;
    private Team team;

    public Player(String name, int number) {
        this.name = name;
        this.number = number;
    }
    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumOfGoals() {
        return numOfGoals;
    }
    public void setNumOfGoals(int numOfGoals) {
        this.numOfGoals = numOfGoals;
    }
    public Team getTeam() {
        return team;
    }
    public void assignTeam(Team team) {
        this.team = team;
    }
}