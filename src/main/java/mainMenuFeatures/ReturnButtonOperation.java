package mainMenuFeatures;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class ReturnButtonOperation {

    public void returnFromLicense(JFXButton licenseButton, JFXButton aboutButton, JFXButton createButton, JFXButton returnButton, JFXTextArea license)
    {

        EventHandler<MouseEvent> rfl = e ->
        {
            createButton.setVisible(true);
            aboutButton.setVisible(true);
            licenseButton.setVisible(true);
            license.setVisible(false);
            returnButton.setVisible(false);


        };
        returnButton.addEventHandler(MouseEvent.MOUSE_CLICKED, rfl);
    }



}
