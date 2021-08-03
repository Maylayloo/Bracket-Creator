package controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import variables.ArrayNicknames;
import variables.NicknamesArrayIndex;
import variables.StartingLayoutNicknamesButtonsArray;


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
        getNicknamesTextField.setStyle("-fx-prompt-text-fill: #e9eaf0; -fx-text-inner-color: white");
        primaryContainer.setStyle("-fx-background-image: url('/images/mainMenuBackground.jpg')");
        getNicknamesTextField.setPromptText("Nickname / Team Name");



    }

    @FXML
    public void add()
    {

           ArrayNicknames.nicknames.add(new JFXButton());


           ArrayNicknames.nicknames.get(NicknamesArrayIndex.index).setStyle("-fx-background-color:  #e9eaf0; -fx-background-radius: 20; -jfx-button-type: RAISED; -fx-font-size: 16");
           primaryContainer.getChildren().add(ArrayNicknames.nicknames.get(NicknamesArrayIndex.index));


           ArrayNicknames.nicknames.get(NicknamesArrayIndex.index).setLayoutX(StartingLayoutNicknamesButtonsArray.layoutX);
           ArrayNicknames.nicknames.get(NicknamesArrayIndex.index).setLayoutY(StartingLayoutNicknamesButtonsArray.layoutY);
           ArrayNicknames.nicknames.get(NicknamesArrayIndex.index).setPrefSize(212, 37);
           ArrayNicknames.nicknames.get(NicknamesArrayIndex.index).setRipplerFill(Paint.valueOf("#e9eaf0"));

           ArrayNicknames.nicknames.get(NicknamesArrayIndex.index).setText(getNicknamesTextField.getText());
           getNicknamesTextField.setText(null);


           NicknamesArrayIndex.index += 1;
           StartingLayoutNicknamesButtonsArray.layoutX += 250;



           if (ArrayNicknames.nicknames.size() % 5 == 0)
           {
               StartingLayoutNicknamesButtonsArray.layoutY += 60;
               StartingLayoutNicknamesButtonsArray.layoutX = 32;
           }

           if (ArrayNicknames.nicknames.size() == 45)
           {
               addButton.setDisable(true);
               getNicknamesTextField.setDisable(true);
           }




    }
}
