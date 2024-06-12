package vue;

import controleur.MainSae;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import modele.Zone;

public class controleurCreaZone {

    @FXML
    private Button annuler;

    @FXML
    private Button creer;

    @FXML
    private TextField nomZone;


    @FXML
    private TextField nomRangee;
    
    
    @FXML
    void creerZone(ActionEvent event) {
    	System.out.println("Zone créer ");
    	String nomZ = nomZone.getText();
        int nomRange = Integer.parseInt(nomRangee.getText());
    	Zone z = new Zone(nomZ,nomRange);
    	System.out.println(z.toString());
    }
    

    @FXML
    void fermer(ActionEvent event) {
    	MainSae.fermerCreaZone();
    }

}
