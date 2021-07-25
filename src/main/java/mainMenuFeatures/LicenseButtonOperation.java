package mainMenuFeatures;

import com.jfoenix.controls.JFXButton;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class LicenseButtonOperation {

        public void clicked(JFXButton button)
        {
            EventHandler<MouseEvent> licenseButtonClicked = e ->
            {
                System.out.println("JD!");
                System.out.println("JD!");
            };

            button.addEventHandler(MouseEvent.MOUSE_CLICKED, licenseButtonClicked);

        }



    }



