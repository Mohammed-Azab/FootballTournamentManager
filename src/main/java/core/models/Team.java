package core.models;

import java.util.List;

public class Team {
    private String name;
    private List<Player> players;
    private int score;

    public Team(String name){
        this.name = name;
    }

    public Team(String name, List<Player> players) {
        this.name = name;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
    public void addPlayer(Player player) {
        player.assignTeam(this);
        players.add(player);
    }
    public void removePlayer(Player player) {
        players.remove(player);
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public void increaseScore(int score) {
        this.score += score;
    }
    public void decreaseScore(int score) {
        this.score -= score;
    }
    public String toString() {
        return name;
    }

}