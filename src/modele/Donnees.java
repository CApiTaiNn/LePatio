package modele;

import javafx.collections.FXCollections;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javafx.collections.ObservableList;

public class Donnees {
	static private ObservableList<AnnulationClient>	lesAnnulation 	= FXCollections.observableArrayList();
	static private ObservableList<Fauteuil>	lesFauteuils 	= FXCollections.observableArrayList();
	
	static private ObservableList<Test>	testlist 	= FXCollections.observableArrayList();
	
	
	static public void chargementDonnees() { 
		/*
		 * 
		 * Ajout des données dans liste des annulations
		 * 
		 * */
		Date currentdate = new Date();
		Abonne client1 = new Abonne("Fauchet", "Benjamin", "Susu", "0712121212", "fauchet@gmail.com", "1");
		Reservation resa1 = new Reservation("1", currentdate, currentdate, client1);
		lesAnnulation.add(new AnnulationClient(currentdate,false,resa1, "Client1"));
		
		Date currentdate1 = new Date();
		Abonne client2 = new Abonne("Fauchet", "Malo", "Lannion", "0712121212", "LaFauche@gmail.com", "2");
		Reservation resa2 = new Reservation("2", currentdate1, currentdate1, client2);
		lesAnnulation.add(new AnnulationClient(currentdate1,false,resa2, "Client2"));
		/*
		 * 
		 * Ajout des données dans liste des fauteuils
		 * 
		 */
		Zone zone = new Zone("Orchestre",5);
		lesFauteuils.add(new Fauteuil("a", "15", zone));
		
		
	}
	
	
	public static ObservableList<AnnulationClient> getLesAnnulations() {
		return lesAnnulation;
	}
	static public ObservableList<Fauteuil> getFauteuil() {
		return lesFauteuils;
	}
	
}
