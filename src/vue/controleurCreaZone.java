package vue;

import controleur.MainSae;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import modele.Donnees;
import modele.Zone;

public class controleurCreaZone {

    @FXML
    private Button annuler;

    @FXML
    private Button creer;

    @FXML
    private TextField nomZone;

    @FXML
    private TextField nombreRangee;
    
    
    @FXML
    public void creerZone(ActionEvent event) {
    	System.out.println("Zone créer");
    	String nomZ = nomZone.getText();
    	int nb_range = Integer.parseInt(nombreRangee.getText());
    	Zone z = new Zone(nomZ,nb_range);
    	System.out.println(z.toString());
    	MainSae.ajoutZone(z);
    }
    

    @FXML
    void fermer(ActionEvent event) {
    	MainSae.fermerCreaZone();
    }
    
    
    @FXML
    void annuler(ActionEvent event) {
    	//MainSae.supFauteuil(listeZone.getSelectionModel().getSelectedItem());
    }

   
}
