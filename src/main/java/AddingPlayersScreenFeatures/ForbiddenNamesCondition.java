package AddingPlayersScreenFeatures;

import com.jfoenix.controls.JFXTextField;

public class ForbiddenNamesCondition {

    public void body(JFXTextField txtF, String str)
    {
        txtF.setText(null);
        txtF.setPromptText(str);
    }

}
