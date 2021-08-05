package controllers;

import AddingPlayersScreenFeatures.AddPlayers;
import Arrays.ArrayGettingNicknamesToString;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;


public class AddPlayersController {

    public MainController mainController;

    public void setMainController(MainController mainController)
    {
        this.mainController = mainController;
    }

    @FXML
    AnchorPane primaryContainer;

    @FXML
    JFXTextField getNicknamesTextField;

    @FXML
    JFXButton addButton;

    public void initialize()
    {

        getNicknamesTextField.setText(null);

        getNicknamesTextField.setStyle("-fx-prompt-text-fill: #e9eaf0; -fx-text-inner-color: white");
        primaryContainer.setStyle("-fx-background-image: url('/images/mainMenuBackground.jpg')");
        getNicknamesTextField.setPromptText("Nickname / Team Name");




        EventHandler<MouseEvent> handler = e ->
          new AddPlayers().add(primaryContainer, getNicknamesTextField, addButton);

        addButton.addEventHandler(MouseEvent.MOUSE_CLICKED, handler);

    }

}
