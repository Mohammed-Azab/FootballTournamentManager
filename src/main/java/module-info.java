module com.example.footballtournamentmanager {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.footballtournamentmanager to javafx.fxml;
    exports com.example.footballtournamentmanager;
}