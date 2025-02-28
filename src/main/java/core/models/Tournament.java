package core.models;


import java.util.ArrayList;
import java.util.List;

public class Tournament {
    private final List<Team> teams = new ArrayList<>();
    private final List<Match> matches = new ArrayList<>();

    public void addTeam(Team team) {
        teams.add(team);
    }
    public void addMatch(Match match) {
        matches.add(match);
    }
    public void removeTeam(Team team) {
        teams.remove(team);
    }
    public void removeMatch(Match match) {
        matches.remove(match);
    }

    public void printMatches() {
        for (Match match : matches) {
            System.out.println(match.getResult());
        }
    }
    public void printTeams() {
        for (Team team : teams) {
            System.out.println(team.getName());
        }
    }
    public void printMatchesWithTeams() {
        for (Match match : matches) {
            System.out.println(match.getResult());
            System.out.println(match.getTeam1().getName());
            System.out.println(match.getTeam2().getName());
        }
    }
    public String toString() {
        return "Tournament{" +
                "teams=" + teams +
                ", matches=" + matches +
                '}';
    }
    public List<Team> getTeams() {
        return new ArrayList<>(teams);
    }

    public List<Match> getMatches() {
        return new ArrayList<>(matches);
    }


}