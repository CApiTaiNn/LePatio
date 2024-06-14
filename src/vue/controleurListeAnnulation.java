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
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import modele.Annulation;
import modele.AnnulationClient;
import modele.Donnees;
import modele.Reservation;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;

public class controleurListeAnnulation {


    @FXML
    private Button fermer;

    @FXML
    private TableView<AnnulationClient> listeResa;

    @FXML
    private Button modifier;
    
    @FXML
    private Button filtrer;

    @FXML
    private TextField numcliFiltre;

    @FXML
    private Button Supprimer;
    
    @FXML
    private Button listeFauteuil;

    
    @FXML
    void listeFauteuil(ActionEvent event) {
    	MainSae.ouvrirListeFauteuil();
    }

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
   			 "Voulez-vous vraiment supprimer cette annulation ?",
   			 ButtonType.YES,
   			 ButtonType.NO
   	);
   	 alert.setTitle("Confirmation du message");
   	 Optional<ButtonType> reponse;
   	 reponse = alert.showAndWait();
   	 if (reponse.get() == ButtonType.YES) {
			MainSae.supprimerAnnulation(listeResa.getSelectionModel().getSelectedItem());
		}System.out.println("Annulation");
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
    	TableColumn<AnnulationClient, String> colonneRepre = new TableColumn<>("Représentation");
	    colonneRepre.setCellValueFactory(cellData -> {
	        Reservation resa = cellData.getValue().getResa();
	        if (resa != null) {
	            return new SimpleStringProperty(resa.getRepresInfo());
	        } else {
	            return new SimpleStringProperty("");
	        }
	    });
	    listeResa.getColumns().add(colonneRepre);
	    
	    //la date de demande d’annulation
	    TableColumn<AnnulationClient, Date> colonne3 = new TableColumn<AnnulationClient,Date>("Date d'annulation");
		colonne3.setCellValueFactory(new PropertyValueFactory<AnnulationClient, Date>("date"));
		listeResa.getColumns().add(colonne3);
		
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
		
		filtrer.disableProperty().bind(numcliFiltre.textProperty().isEmpty());

    }
    
    
    @FXML
    void filtrerClient(ActionEvent event) {
    	//String num_cli = numcliFiltre.getText();
    	listeResa.setItems(Donnees.listeFiltrer(numcliFiltre.getText()));
    	//MainSae.triAnnulation(num_cli);
    }
  

}