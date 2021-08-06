package AddingPlayersScreenFeatures;

import Arrays.ArrayGettingNicknamesToString;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import Arrays.ArrayNicknames;
import variables.NicknamesArrayIndex;
import variables.StartingLayoutNicknamesButtonsArray;

public class AddPlayers {

    public void add(AnchorPane container, JFXTextField txtField, JFXButton b1) {

        txtField.setPromptText("Nickname / Team Name");


        if (txtField.getText() == null)
            new ForbiddenNamesCondition().body(txtField, "Name can't be empty");

        else if (txtField.getText().length() > 16)
            new ForbiddenNamesCondition().body(txtField, "Name can be up to 16 characters");

        else if (txtField.getText().startsWith(" "))
            new ForbiddenNamesCondition().body(txtField, "Name cannot start with spacebars");

       else
       {
           ArrayNicknames.nicknames.add(new JFXButton());


           ArrayNicknames.nicknames.get(NicknamesArrayIndex.index).setStyle("-fx-background-color:  #e9eaf0; -fx-background-radius: 20; -jfx-button-type: RAISED; -fx-font-size: 16");

           container.getChildren().add(ArrayNicknames.nicknames.get(NicknamesArrayIndex.index));

           new SetNamesLayout().setLayout(ArrayNicknames.nicknames, NicknamesArrayIndex.index, StartingLayoutNicknamesButtonsArray.layoutX, StartingLayoutNicknamesButtonsArray.layoutY);

           ArrayNicknames.nicknames.get(NicknamesArrayIndex.index).setPrefSize(212, 37);
           ArrayNicknames.nicknames.get(NicknamesArrayIndex.index).setRipplerFill(Paint.valueOf("#e9eaf0"));

           ArrayNicknames.nicknames.get(NicknamesArrayIndex.index).setText(txtField.getText());

           new SaveNicknames().addNameToArray(ArrayGettingNicknamesToString.nicknamesInString, txtField.getText());

           txtField.setText(null);

           NicknamesArrayIndex.index += 1;
           StartingLayoutNicknamesButtonsArray.layoutX += 250;

           if (ArrayNicknames.nicknames.size() % 5 == 0)
           {
               StartingLayoutNicknamesButtonsArray.layoutY += 60;
               StartingLayoutNicknamesButtonsArray.layoutX = 32;
           }

           if (ArrayNicknames.nicknames.size() == 45)
           {
               b1.setDisable(true);
               txtField.setDisable(true);
           }
       }


    }
}
