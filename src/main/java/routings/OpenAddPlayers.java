package routings;

import controllers.AddPlayersController;
import controllers.MainController;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class OpenAddPlayers {

    public OpenAddPlayers move(MainController mainController)
    {
        FXMLLoader openPlayersAdding = new FXMLLoader();
        openPlayersAdding.setLocation(this.getClass().getResource("/fxml/addPlayers.fxml"));
        AnchorPane pane = null;
        try {
            pane = openPlayersAdding.load();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        AddPlayersController addPlayersController = openPlayersAdding.getController();
        addPlayersController.setMainController(mainController);
        mainController.setScreen(pane);

        return null;
    }


}
