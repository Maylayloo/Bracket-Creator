import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import mainMenuFeatures.LicenseButtonOperation;

public class AboutButtonOperation {

    public void clicked(JFXButton button, JFXButton button2, JFXButton button3, JFXButton returnButton, JFXTextArea about)
    {
        new LicenseButtonOperation().clicked(button, button2, button3, returnButton, about);
    }

}
