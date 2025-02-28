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

    public void printMatches() {
        for (Match match : matches) {
            System.out.println(match.getResult());
        }
    }
}