package vue;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
        // Initialize the TableView columns
        colonne1.setCellValueFactory(new PropertyValueFactory<>("numero"));


        // Set the data to the TableViewé
        listeZone.setItems(data);
    }

    public void afficherImprime(Fauteuil f) {
        data.add(f);
    }

}
