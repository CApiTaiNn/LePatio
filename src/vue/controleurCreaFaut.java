package vue;

import controleur.MainSae;
import javafx.event.ActionEvent;


import controleur.MainSae;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

import modele.Fauteuil;
import modele.Zone;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;


public class controleurCreaFaut {

    @FXML
    private MenuButton choixZone;

    @FXML
    private Button annuler;
  

    @FXML
    private TextField txtFaut;

    @FXML
    private Button Creer;

    @FXML
    private MenuButton choixRange;
    

    private String selectedZone;
    private String selectedRange;
    
    @FXML
    public void initialize() {
    	Creer.disableProperty().bind(txtFaut.textProperty().isEmpty());
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
    void clicCreer(ActionEvent event) {
    	String num = txtFaut.getText();
        Zone zone = Zone.fromString(selectedZone); 
    	modele.Fauteuil f = new Fauteuil(selectedRange, num, zone);
    	
    	MainSae.ouvrirListeFauteuil(f);
    }

    @FXML
    void clicAnnuler(MouseEvent event) {
    	MainSae.fermerCreaFaut();
    }
    
    @FXML
    void fermer(ActionEvent event) {
    	MainSae.fermerCreaFaut();
    }
    
}

