package modele;

import javafx.collections.FXCollections;
import java.util.Date;
import javafx.collections.ObservableList;

public class Donnees {
	static private ObservableList<Annulation>	lesAnnulation 	= FXCollections.observableArrayList();
	
	static public void chargementDonnees() { 
		Date currentdate = new Date();
		Abonne client1 = new Abonne("Fauchet", "Benjamin", "Susu", "0712121212", "fauchet@gmail.com", "1");
		Reservation resa1 = new Reservation("1", currentdate, currentdate, client1);
		lesAnnulation.add(new AnnulationClient(currentdate,false,resa1, "Client1"));
	}
	
	
	public static ObservableList<Annulation> getLesAnnulations() {
		return lesAnnulation;
	}
}
