package modele;

import javafx.collections.FXCollections;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import controleur.MainSae;
import javafx.collections.ObservableList;

public class Donnees {
	static private ObservableList<AnnulationClient>	lesAnnulation 	= FXCollections.observableArrayList();
	static private ObservableList<Fauteuil>	lesFauteuils 	= FXCollections.observableArrayList();
	static private ObservableList<AnnulationClient>	listeFiltrer 	= FXCollections.observableArrayList();
	
	
	static public void chargementDonnees() { 
		/*
		 * 
		 * Ajout des données dans liste des annulations
		 * 
		 * */
		Theatre theatre = new Theatre("Theatre");
		Spectacle s1 = new Spectacle("bambi", 120, 200, theatre);
		Representation repre = new Representation("12", "21h", true, s1);
		
		Date currentdate = new Date();
		Abonne client1 = new Abonne("Fauchet", "Benjamin", "Susu", "0712121212", "fauchet@gmail.com", "1");
		Reservation resa1 = new Reservation("1", currentdate, currentdate, client1);
		
		resa1.setRepresentation(repre);
		lesAnnulation.add(new AnnulationClient(currentdate,false,resa1, "Client1"));
		
		Date currentdate1 = new Date();
		Abonne client2 = new Abonne("Fauchet", "Malo", "Lannion", "0712121212", "LaFauche@gmail.com", "2");
		Reservation resa2 = new Reservation("2", currentdate1, currentdate1, client2);
		
		resa2.setRepresentation(repre);
		lesAnnulation.add(new AnnulationClient(currentdate1,false,resa2, "Client2"));
		/*
		 * 
		 * Ajout des données dans liste des fauteuils
		 * 
		 */
		Zone zone = new Zone("Zone B",5);
		lesFauteuils.add(new Fauteuil("15", "A", zone));
		
		Fauteuil f = new Fauteuil("10", "C", zone);
		Billet b1 = new Billet("1",f, resa2);
		resa2.ajouteBillet(b1);
	
		
	}
	
	
	public static ObservableList<AnnulationClient> getLesAnnulations() {
		return lesAnnulation;
	}
	static public ObservableList<Fauteuil> getFauteuil() {
		return lesFauteuils;
	}
	
	/*
	 * 
	 * Modification des données
	 * 
	 * 
	 */
	
	static public void supprimerReservation(AnnulationClient a) {
		boolean trouve = false;
		int i=0;
		while (!trouve && i<lesAnnulation.size()) {
			if (lesAnnulation.get(i).getNom().equals(a.getNom())){
				lesAnnulation.remove(i);
				trouve = true;
			}
			i++;
		}
		System.out.println("c bon");
	}
	static public void supprimerFauteuil(Fauteuil e) {
		boolean trouve = false;
		int i=0;
		while (!trouve && i<lesFauteuils.size()) {
			if (lesFauteuils.get(i).getNumero().equals(e.getNumero())  && lesFauteuils.get(i).getRangee().equals(e.getRangee())  &&  lesFauteuils.get(i).getZone().getNom().equals(e.getZone().getNom())){
				lesFauteuils.remove(i);
				trouve = true;
			}
			i++;
		}
		System.out.println("c bon");
	}
	
	static public void ajoutFauteuil(Fauteuil f) {
		lesFauteuils.add(f);
	}
	
	
	public static ObservableList<AnnulationClient> listeFiltrer(String clientNum) {
        for (AnnulationClient a : lesAnnulation) {
			if(a.getResa().getClient().getNumero().equals(clientNum)){
				listeFiltrer.add(a);
			}
		}
        return listeFiltrer;
    }
	
	
}
