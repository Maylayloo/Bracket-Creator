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



    public void initialize()
    {
        primaryContainer.setStyle("-fx-background-image: url('/images/mainMenuBackground.jpg')");
    }




}
