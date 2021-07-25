import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import mainMenuFeatures.LicenseButtonOperation;

public class MainMENU {

    private MainController mainController;

    public void setMainController(MainController mainController)
    {
        this.mainController = mainController;
    }

    @FXML
    AnchorPane primaryContainer;

    @FXML
    JFXButton createBracketButton, aboutButton, licenseButton, returnButton;

    @FXML
    JFXTextArea license;


    public void initialize()
    {
        primaryContainer.setStyle("-fx-background-image: url('/images/mainMenuBackground.jpg')");

        new LicenseButtonOperation().clicked(licenseButton, aboutButton, createBracketButton, returnButton, license);
    }




}
