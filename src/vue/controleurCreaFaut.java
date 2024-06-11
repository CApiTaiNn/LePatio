package vue;

<<<<<<< HEAD
import controleur.MainSae;
import javafx.event.ActionEvent;
=======

import controlleur.MainSae;
import javafx.beans.binding.Bindings;
>>>>>>> 3480142ad64a9547938dbdd7afbdf7e8574a81dd
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
<<<<<<< HEAD
import modele.Fauteuil;
import modele.Zone;
import javafx.scene.control.*;
=======
import javafx.scene.input.MouseEvent;
>>>>>>> 3480142ad64a9547938dbdd7afbdf7e8574a81dd

public class controleurCreaFaut {

    @FXML
    private MenuButton choixZone;

    @FXML
<<<<<<< HEAD
    private Button annuler;

=======
    private Button ok;
    
    @FXML
    private Button annuler;
    
>>>>>>> 3480142ad64a9547938dbdd7afbdf7e8574a81dd
    @FXML
    private TextField txtFaut;

    @FXML
    private Button creer;

    @FXML
    private MenuButton choixRange;
    
<<<<<<< HEAD
    private String selectedZone;
    private String selectedRange;
    
    @FXML
    public void initialize() {
        
        for (MenuItem item : choixZone.getItems()) {
            item.setOnAction(event -> {
                selectedZone = item.getText();
                choixZone.setText(selectedZone); 
            });
        }

        
        for (MenuItem item : choixRange.getItems()) {
            item.setOnAction(event -> {
                selectedRange = item.getText();
                choixRange.setText(selectedRange); 
            });
        }
    }

    @FXML
    void creerFauteuil(ActionEvent event) {
    	String num = txtFaut.getText();
        Zone zone = Zone.fromString(selectedZone); 
    	modele.Fauteuil f = new Fauteuil(selectedRange, num, zone);
    	
    	MainSae.ouvrirListeFauteuil(f);
    }

}
=======
    
    
    @FXML
    void clicOk(MouseEvent event) {
    	
    }

    @FXML
    void clicAnnuler(MouseEvent event) {
    	MainSae.fermerCreaFaut();
    }
    public void initialize() {
		ok.disableProperty().bind(txtFaut.textProperty().isEmpty());
	}
    
}
>>>>>>> 3480142ad64a9547938dbdd7afbdf7e8574a81dd
