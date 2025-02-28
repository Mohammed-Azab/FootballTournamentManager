package core;


import core.models.Match;
import core.models.Team;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private final List<Team> teams = new ArrayList<>();
    private final List<Match> matches = new ArrayList<>();

    public void addTeam(Team team) {
        teams.add(team);
    }

    public List<Team> getTeams() {
        return new ArrayList<>(teams);
    }

    public void addMatch(Match match) {
        matches.add(match);
    }

    public List<Match> getMatches() {
        return new ArrayList<>(matches);
    }

    public void clearTeams() {
        teams.clear();
    }

    public void clearMatches() {
        matches.clear();
    }
}