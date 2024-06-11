package vue;


import controlleur.MainSae;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class controleurCreaFaut {

    @FXML
    private MenuButton choixZone;

    @FXML
    private Button ok;
    
    @FXML
    private Button annuler;
    
    @FXML
    private TextField txtFaut;

    @FXML
    private MenuButton choixRange;
    
    
    
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
