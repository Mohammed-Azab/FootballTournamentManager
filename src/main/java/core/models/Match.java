package core.models;

public class Match {
    private final Team team1;
    private final Team team2;
    private int score1;
    private int score2;

    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public void setScore(int score1, int score2) {
        this.score1 = score1;
        this.score2 = score2;
    }
    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public int getScore1() {
        return score1;
    }

    public int getScore2() {
        return score2;
    }

    public boolean isItDraw() {
        return score1 == score2;
    }


    public String getResult() {
        return team1.getName() + " " + score1 + " - " + score2 + " " + team2.getName();
    }

    public String toString() {
        return getResult();
    }
}