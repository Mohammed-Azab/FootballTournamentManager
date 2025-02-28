module footballtournamentmanager {
    requires javafx.controls;
    requires javafx.base;
    requires javafx.fxml;
    requires javafx.media;
    requires transitive javafx.graphics;
    requires org.apache.poi.ooxml;
    requires java.desktop;
    requires java.logging;

    exports core;
    exports core.models;
    exports core.controllers;
    opens core to javafx.fxml;
}