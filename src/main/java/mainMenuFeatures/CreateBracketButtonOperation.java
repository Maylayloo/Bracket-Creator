package mainMenuFeatures;

import com.jfoenix.controls.JFXButton;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class CreateBracketButtonOperation {

    public void clicked(JFXButton button)
    {
        EventHandler<MouseEvent> cBBC = e -> {


        };
        button.addEventHandler(MouseEvent.MOUSE_CLICKED, cBBC);




    }

}
