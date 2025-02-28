package core.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import core.models.Team;
import javafx.scene.input.MouseEvent;

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
    public void Schedule(MouseEvent mouseEvent) {

    }

    @FXML
    public void saveTeam(MouseEvent mouseEvent) {
    }
}