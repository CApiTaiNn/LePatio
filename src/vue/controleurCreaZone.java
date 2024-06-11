package vue;

import controleur.MainSae;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class controleurCreaZone {

    @FXML
    private Button annuler;

    @FXML
    private TextField nomSpectacle;

    @FXML
    private TextField nomZone;

    @FXML
    private Button creer;

    @FXML
    private TextField nomRangee;

    @FXML
    void creerZone(ActionEvent event) {
    	System.out.println("Zone créer ");
    	String nomSpec = nomSpectacle.getText();
    	String nomZ = nomZone.getText();
    	String nomRange = nomRangee.getText();
    }

    @FXML
    void fermer(ActionEvent event) {
    	MainSae.fermerCreaZone();
    }

}
