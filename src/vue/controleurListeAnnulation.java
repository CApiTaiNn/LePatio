package vue;

import java.util.Date;
import java.util.Optional;


import controleur.MainSae;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.MenuButton;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import modele.Annulation;
import modele.AnnulationClient;
import modele.Donnees;
import modele.Reservation;
import javafx.beans.property.SimpleStringProperty;

public class controleurListeAnnulation {

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
     void ajouterListe(ActionEvent e) {
		

	}
    
    @FXML
     void modifListe(ActionEvent e) {
		// TODO Auto-generated method stub

	}

    @FXML
    void supListe(ActionEvent event) {
    	// fxml qui detecte peut être pas le clic
    	Alert alert = new Alert(
   			 AlertType.CONFIRMATION,
   			 "Voulez-vous vraiment supprimer cet employé ?",
   			 ButtonType.YES,
   			 ButtonType.NO
   	);
   	 alert.setTitle("Confirmation du message");
   	 alert.showAndWait();
   	 Optional<ButtonType> reponse;
   	 reponse = alert.showAndWait();
   	 if (reponse.get() == ButtonType.YES) {
			MainSae.supprimerAnnulation(listeResa.getSelectionModel().getSelectedItem());
		}
    System.out.println("ça marche");
    }

    @FXML
    void listeresa(MouseEvent event) {

    }
    
    @FXML
    void initialize() {
    	
    	//Nom et numero du client
    	TableColumn<AnnulationClient, String> colonneClient = new TableColumn<>("Client");
	    colonneClient.setCellValueFactory(cellData -> {
	        Reservation resa = cellData.getValue().getResa();
	        if (resa != null) {
	            return new SimpleStringProperty(resa.getClientInfo());
	        } else {
	            return new SimpleStringProperty("");
	        }
	    });
	    listeResa.getColumns().add(colonneClient);
	    
	    
	  //le nom du spectacle, la date et l’heure de début de la représentation concernée
    	TableColumn<AnnulationClient, String> colonneRepre = new TableColumn<>("Client");
	    colonneRepre.setCellValueFactory(cellData -> {
	        Reservation resa = cellData.getValue().getResa();
	        if (resa != null) {
	            return new SimpleStringProperty(resa.getRepresInfo());
	        } else {
	            return new SimpleStringProperty("");
	        }
	    });
	    listeResa.getColumns().add(colonneRepre);
	    
	    /*
    	TableColumn<AnnulationClient, String> colonne1 = new TableColumn<AnnulationClient,String>("Client");
		colonne1.setCellValueFactory(new PropertyValueFactory<AnnulationClient,String>("nom"));	
		listeResa.getColumns().add(colonne1);
		*/
		TableColumn<AnnulationClient, Boolean> colonne2 = new TableColumn<AnnulationClient,Boolean>("Remboursement");
		colonne2.setCellValueFactory(new PropertyValueFactory<AnnulationClient, Boolean>("remboursementEffectue"));
		listeResa.getColumns().add(colonne2);
		
		TableColumn<AnnulationClient, Date> colonne3 = new TableColumn<AnnulationClient,Date>("Date d'annulation");
		colonne3.setCellValueFactory(new PropertyValueFactory<AnnulationClient, Date>("date"));
		listeResa.getColumns().add(colonne3);
		
		TableColumn<AnnulationClient,Reservation> colonne4 = new TableColumn<AnnulationClient,Reservation>("Info réservation");
		colonne4.setCellValueFactory(new PropertyValueFactory<AnnulationClient, Reservation>("resa"));
		listeResa.getColumns().add(colonne4);
		
		TableColumn<AnnulationClient, String> colonneBillets = new TableColumn<>("Billets");
	    colonneBillets.setCellValueFactory(cellData -> {
	        Reservation resa = cellData.getValue().getResa();
	        if (resa != null) {
	            return new SimpleStringProperty(resa.getBillet());
	        } else {
	            return new SimpleStringProperty("");
	        }
	    });
	    listeResa.getColumns().add(colonneBillets);
			
		listeResa.setItems(Donnees.getLesAnnulations());
		listeResa.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		
		//griser les boutons Modifier et Supprimer quand aucune s�lection
		//BooleanBinding rien = Bindings.equal(tvListeEmployes.getSelectionModel().selectedIndexProperty(), -1);
		//bnSupprimer.disableProperty().bind(rien);
		//bnModifier.disableProperty().bind(rien);

    }

}