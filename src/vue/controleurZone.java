package vue;

import controleur.MainSae;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import modele.Fauteuil;
import javafx.scene.control.cell.PropertyValueFactory;

public class controleurZone {

    @FXML
    private Button fauteuil;

    @FXML
    private Button créerZone;

    @FXML
    private TableView<Fauteuil> listeZone;

    @FXML
    private Button modifZone;

    @FXML
    private Button supZone;

    @FXML
    private Button fermer;

    @FXML
    private Button supFauteuil;
    
    @FXML
    private TableColumn<Fauteuil, String> colonne1;
    
    private ObservableList<Fauteuil> data = FXCollections.observableArrayList();
    
    
    @FXML
    public void initialize() {
        colonne1.setCellValueFactory(new PropertyValueFactory<>("numero"));

        listeZone.setItems(data);
    }
    

    public void afficherImprime(Fauteuil f) {
        data.add(f);
        System.out.println("confirmation de creation");
    }
    
    
    @FXML
    void creerFauteuil(ActionEvent event) {
    	MainSae.ouvrirCreaFaut();
    }
	
    
    @FXML
    void creerZone(ActionEvent event) {
    	MainSae.ouvrirCreaZone();
    }
    
    @FXML
    void fermer(ActionEvent event) {
    	MainSae.fermerListeZone();
    }
}
