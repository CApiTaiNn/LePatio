package vue;

import controleur.MainSae;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
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
    	int nb_range;
    	try {
            nb_range = Integer.parseInt(nombreRangee.getText());
        } catch (NumberFormatException e) {
            System.out.println("Nombre de rangées invalide.");
            return;
        }
    	Zone z = new Zone(nomZ, nb_range);
    	if (!MainSae.zoneExists(nomZ)) {
            MainSae.ajoutZone(z);
        } else {
            System.out.println("La zone existe déjà");
        }
    }
    
    

    @FXML
    void fermer(ActionEvent event) {
    	MainSae.fermerCreaZone();
    }
    
    
    @FXML
    void annuler(ActionEvent event) {
    	//MainSae.supFauteuil(listeZone.getSelectionModel().getSelectedItem());
    }

    
    public boolean zoneExists(String zoneName) {
        for (MenuItem item : MainSae.getControleurCreaFaut().getChoixZone().getItems()) {
            if (item.getText().equals(zoneName)) {
                return true;
            }
        }
        return false;
    }
   
}
