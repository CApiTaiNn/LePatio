package vue;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class controlleurPatio {

    @FXML
    private Button fermer;

    @FXML
    void fermer(MouseEvent event) {
    	System.exit(0);
    }

}
