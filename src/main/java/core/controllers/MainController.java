package core.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import models.Team;

public class MainController {
    @FXML
    private ListView<Team> teamListView;

    @FXML
    public void initialize() {
        // Initialize the list view with teams
    }

    @FXML
    private void handleAddTeam() {
        // Handle adding a new team
    }

    @FXML
    private void handleScheduleMatch() {
        // Handle scheduling a new match
    }
}