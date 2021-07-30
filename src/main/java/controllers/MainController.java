package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MainController {

    @FXML
    AnchorPane primary_aPane;

    @FXML
    public void initialize()
    {
        FXMLLoader openMENU = new FXMLLoader();
        openMENU.setLocation(this.getClass().getResource("/fxml/menu.fxml"));
        AnchorPane pane = null;
        try {
            pane = openMENU.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        MainMENU mainMENU = openMENU.getController();
        mainMENU.setMainController(this);
        setScreen(pane);


    }

    public void setScreen(AnchorPane pane)
    {
        primary_aPane.getChildren().clear();
        primary_aPane.getChildren().add(pane);
    }

}
