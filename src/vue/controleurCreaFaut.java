package vue;



import controleur.MainSae;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import modele.Fauteuil;
import modele.Zone;
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
    
    @FXML
    private MenuItem ZoneA;

    @FXML
    private MenuItem ZoneB;

    @FXML
    private MenuItem ZoneC;

    @FXML
    private MenuItem ZoneD;
    

    private Zone selectedZone;
    private String selectedRange;

	
    
    @FXML
    public void initialize() {
    	Creer.disableProperty().bind(txtFaut.textProperty().isEmpty());
    	
    	for (MenuItem item : choixZone.getItems()) {
            item.setOnAction(event -> {
                if (item.getUserData() instanceof Zone) {
                    selectedZone = (Zone) item.getUserData();
                    choixZone.setText(selectedZone.getNom());
                } else {
                    String zoneName = item.getText();
                    // Create a default Zone object based on the zone name
                    selectedZone = new Zone(zoneName, 12); // assuming default 12 rows
                    choixZone.setText(zoneName);
                }
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
        String zoneName = z.getNom();
        if (!zoneExists(zoneName)) {
            MenuItem nouvelleZone = new MenuItem(zoneName);
            nouvelleZone.setUserData(z);
            nouvelleZone.setOnAction(event -> {
                selectedZone = (Zone) nouvelleZone.getUserData();
                choixZone.setText(selectedZone.getNom());
            });
            choixZone.getItems().add(nouvelleZone);
        } else {
            System.out.println("La zone existe déjà !");
        }
    }
    
    
    public boolean zoneExists(String zoneName) {
        for (MenuItem item : choixZone.getItems()) {
            if (item.getText().equals(zoneName)) {
                return true;
            }
        }
        return false;
    }

    public MenuButton getChoixZone() {
        return choixZone;
    }
}

