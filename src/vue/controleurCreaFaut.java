package vue;

import java.util.List;

import controleur.MainSae;
import javafx.event.ActionEvent;


import controleur.MainSae;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import modele.Donnees;
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
    

    private Zone selectedZone;
    private String selectedRange;

	
    
    @FXML
    public void initialize() {
    	Creer.disableProperty().bind(txtFaut.textProperty().isEmpty());

    	for (MenuItem item : choixZone.getItems()) {
            item.setOnAction(event -> {
                selectedZone = (Zone) item.getUserData();
                choixZone.setText(selectedZone.getNom());
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
    	modele.Fauteuil f = new Fauteuil(num,selectedRange, selectedZone);    	
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
    
    

    
    
    public void ajoutZone(Zone z) {
        MenuItem nouvelleZone = new MenuItem(z.getNom());
        nouvelleZone.setUserData(z); // Store the Zone object in the MenuItem
        nouvelleZone.setOnAction(event -> {
            selectedZone = (Zone) nouvelleZone.getUserData();
            choixZone.setText(selectedZone.getNom());
        });
        choixZone.getItems().add(nouvelleZone);
    }
    
}

