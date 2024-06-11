package vue;

import controlleur.MainSae;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

public class controleurZone {

    @FXML
    private Button fauteuil;

    @FXML
    private Button créerZone;

    @FXML
    private TableView<?> listeZone;

    @FXML
    private Button modifZone;

    @FXML
    private Button supZone;

    @FXML
    private Button fermer;

    @FXML
    private Button supFauteuil;
    
    @FXML
    void creerFaut(MouseEvent event) {

    }

    @FXML
    void supprimerFaut(MouseEvent event) {

    }

    @FXML
    void ajouterZone(MouseEvent event) {

    }

    @FXML
    void modifZone(MouseEvent event) {

    }

    @FXML
    void supprimerZone(MouseEvent event) {

    }

    @FXML
    void fermer(MouseEvent event) {
    	MainSae.fermerListeZone();
    }
    /*
    public void initialize() {
		créerZone.disableProperty().bind(txtFaut.textProperty().isEmpty());
	}
	*/

}
