package controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import mainMenuFeatures.AboutButtonOperation;
import mainMenuFeatures.LicenseButtonOperation;
import routings.OpenAddPlayers;

public class MainMENU {

   public MainController mainController;

    public void setMainController(MainController mainController)
    {
        this.mainController = mainController;
    }

    @FXML
    AnchorPane primaryContainer;

    @FXML
    JFXButton createBracketButton, aboutButton, licenseButton, returnButton;

    @FXML
    JFXTextArea license, about;


    public void initialize()
    {
        primaryContainer.setStyle("-fx-background-image: url('/images/mainMenuBackground.jpg')");

        new LicenseButtonOperation().clicked(licenseButton, aboutButton, createBracketButton, returnButton, license);
        new AboutButtonOperation().clicked(aboutButton, licenseButton, createBracketButton, returnButton, about);

        createButtonIsClicked();


    }

    public void createButtonIsClicked()
    {
        EventHandler<MouseEvent> cBBC = e ->
                new OpenAddPlayers().move(mainController);

        createBracketButton.addEventHandler(MouseEvent.MOUSE_CLICKED, cBBC);
    }


}
