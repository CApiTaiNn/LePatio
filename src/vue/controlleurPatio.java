package vue;

import java.util.Date;

import controleur.MainSae;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import modele.Annulation;
import modele.AnnulationClient;
import modele.Donnees;
import modele.Reservation;

public class controlleurPatio {

    @FXML
    private Button ajouter;

    @FXML
    private Button fermer;

    @FXML
    private TableView<AnnulationClient> listeResa;

    @FXML
    private Button modifier;

    @FXML
    private MenuButton choixTrie;

    @FXML
    private Button Supprimer;

    @FXML
    void fermer(MouseEvent event) {
    	MainSae.fermer();
    }
    @FXML
    void ajouter(MouseEvent event) {

    }

    @FXML
    void modifier(MouseEvent event) {

    }

    @FXML
    void supprimer(MouseEvent event) {

    }

    @FXML
    void listeresa(MouseEvent event) {

    }
    
    @FXML
    void initialize() {
    	TableColumn<AnnulationClient, String> colonne1 = new TableColumn<AnnulationClient,String>("Nom");
		colonne1.setCellValueFactory(new PropertyValueFactory<AnnulationClient,String>("nom"));	
		listeResa.getColumns().set(0, colonne1);
		
		TableColumn<AnnulationClient, Boolean> colonne2 = new TableColumn<AnnulationClient,Boolean>("Nom");
		colonne2.setCellValueFactory(new PropertyValueFactory<AnnulationClient, Boolean>("remboursementEffectue"));
		listeResa.getColumns().add(colonne2);

		TableColumn<AnnulationClient, Date> colonne3 = new TableColumn<AnnulationClient,Date>("Poste");
		colonne3.setCellValueFactory(new PropertyValueFactory<AnnulationClient, Date>("date"));
		listeResa.getColumns().add(colonne3);

		TableColumn<AnnulationClient,Reservation> colonne4 = new TableColumn<AnnulationClient,Reservation>("D�partement");
		colonne4.setCellValueFactory(new PropertyValueFactory<AnnulationClient, Reservation>("resa"));
		listeResa.getColumns().add(colonne4);
			
		listeResa.setItems(Donnees.getLesAnnulations());
		listeResa.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		
		//griser les boutons Modifier et Supprimer quand aucune s�lection
		//BooleanBinding rien = Bindings.equal(tvListeEmployes.getSelectionModel().selectedIndexProperty(), -1);
		//bnSupprimer.disableProperty().bind(rien);
		//bnModifier.disableProperty().bind(rien);

    }

}
