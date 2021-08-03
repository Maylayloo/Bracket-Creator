package AddingPlayersScreenFeatures;

import com.jfoenix.controls.JFXButton;

import java.util.ArrayList;

public class SetNamesLayout {

    public void setLayout(ArrayList<JFXButton> list, int index, int x, int y)
    {
        list.get(index).setLayoutX(x);
        list.get(index).setLayoutY(y);
    }

}
