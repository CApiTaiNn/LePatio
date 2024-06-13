package vue;

import controleur.MainSae;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import modele.AnnulationClient;
import modele.Donnees;
import modele.Fauteuil;
import modele.Zone;
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
    	
    	

        colonne1 = new TableColumn<Fauteuil,String>("Numero");
        colonne1.setCellValueFactory(new PropertyValueFactory<>("numero"));
        listeZone.getColumns().set(0, colonne1);

        TableColumn<Fauteuil, String> colonne2 = new TableColumn<Fauteuil,String>("Rangée");
		colonne2.setCellValueFactory(new PropertyValueFactory<Fauteuil, String>("rangee"));
		listeZone.getColumns().add(colonne2);

        TableColumn<Fauteuil, Zone> colonne3 = new TableColumn<Fauteuil,Zone>("Zone");
		colonne3.setCellValueFactory(new PropertyValueFactory<Fauteuil, Zone>("zone"));
		listeZone.getColumns().add(colonne3);

        //listeZone.setItems(data);
       listeZone.setItems(Donnees.getFauteuil());
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
    	MainSae.fermerListeFauteuil();
    }
    
    @FXML
    void modifZone(ActionEvent event) {
    	//MainSae.supFauteuil(listeZone.getSelectionModel().getSelectedItem());
    }
    @FXML
    void supZone(ActionEvent event) {
    	
    }
    @FXML
    void supFauteuil(ActionEvent event) {
    	MainSae.supFauteuil(listeZone.getSelectionModel().getSelectedItem());
    }
    
}
