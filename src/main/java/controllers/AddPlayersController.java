package controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class AddPlayersController {

    public MainController mainController;

    public void setMainController(MainController mainController)
    {
        this.mainController = mainController;
    }

    @FXML
    AnchorPane primaryContainer;

    public void initialize()
    {

    }
}
