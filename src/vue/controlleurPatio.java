package vue;

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
import modele.Donnees;
import modele.Reservation;

public class controlleurPatio {

    @FXML
    private Button ajouter;

    @FXML
    private Button fermer;

    @FXML
    private TableView<Annulation> listeResa;

    @FXML
    private Button modifier;

    @FXML
    private MenuButton choixTrie;

    @FXML
    private Button Supprimer;

    @FXML
    void fermer(MouseEvent event) {
    	System.exit(0);
    }
    
    
    void initialize() {
    	TableColumn<Annulation, String> colonne1 = new TableColumn<Annulation,String>("Nom");
		colonne1.setCellValueFactory(new PropertyValueFactory<Annulation,String>("nom"));	
		listeResa.getColumns().set(0, colonne1);
		/*
		TableColumn<Annulation, String> colonne2 = new TableColumn<Annulation,String>("Nom");
		colonne2.setCellValueFactory(new PropertyValueFactory<Annulation, String>("nom"));
		listeResa.getColumns().set(1, colonne2);
		TableColumn<Annulation, String> colonne3 = new TableColumn<Annulation,String>("Poste");
		colonne3.setCellValueFactory(new PropertyValueFactory<Annulation, String>("poste"));
		listeResa.getColumns().set(2, colonne3);
		TableColumn<Annulation,Integer> colonne4 = new TableColumn<Annulation,Integer>("D�partement");
		colonne4.setCellValueFactory(new PropertyValueFactory<Annulation, Integer>("dept"));
		listeResa.getColumns().set(3, colonne4);
			*/	
		listeResa.setItems(Donnees.getLesAnnulations());
		listeResa.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		
		//griser les boutons Modifier et Supprimer quand aucune s�lection
		//BooleanBinding rien = Bindings.equal(tvListeEmployes.getSelectionModel().selectedIndexProperty(), -1);
		//bnSupprimer.disableProperty().bind(rien);
		//bnModifier.disableProperty().bind(rien);

    }

}
