import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class MainMENU {

    private MainController mainController;

    public void setMainController(MainController mainController)
    {
        this.mainController = mainController;
    }

    @FXML
    AnchorPane primaryContainer;

    @FXML
    JFXButton createLadderButton, aboutButton, licenseButton;



    public void initialize()
    {
        primaryContainer.setStyle("-fx-background-image: url('/images/mainMenuBackground.jpg')");
    }




}
