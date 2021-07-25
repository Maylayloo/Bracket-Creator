package mainMenuFeatures;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class LicenseButtonOperation {

        public void clicked(JFXButton button, JFXButton button2, JFXButton button3, JFXButton returnButton, JFXTextArea license)
        {
            EventHandler<MouseEvent> licenseButtonClicked = e ->
            {
                button.setVisible(false);
                button2.setVisible(false);
                button3.setVisible(false);
                license.setVisible(true);
                returnButton.setVisible(true);
            };

            button.addEventHandler(MouseEvent.MOUSE_CLICKED, licenseButtonClicked);

        }



    }



