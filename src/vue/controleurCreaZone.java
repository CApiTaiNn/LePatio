package vue;

import controleur.MainSae;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class controleurCreaZone {

    @FXML
    private Button annuler;

    @FXML
    private TextField nomSpectacle;

    @FXML
    private TextField nomZone;

    @FXML
    private Button ok;

    @FXML
    private TextField nomRangee;

    @FXML
    void clicOk(MouseEvent event) {

    }

    @FXML
    void clicAnnuler(MouseEvent event) {
    	MainSae.fermerCreaZone();
    }
    public void initialize() {
		ok.disableProperty().bind(nomRangee.textProperty().isEmpty());
	}

}
