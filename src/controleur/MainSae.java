package controleur;

import vue.FenCreaFaut;
import vue.FenCreaZone;
import vue.FenListeTrie;
import vue.FenListeZone;
import vue.controleurCreaFaut;
import vue.controleurZone;
import javafx.application.Application;
//import javafx.stage.Modality;
import javafx.stage.Stage;
import modele.AnnulationClient;
import modele.Donnees;
import modele.Fauteuil;
import modele.Zone;


public class MainSae extends Application {
	static private FenListeTrie fListe;
	static private FenListeZone fZone;
	static private FenCreaFaut fCreaFaut;
	static private FenCreaZone fCreaZ;
	
    static private controleurCreaFaut ctrlFaut;



	public void start(Stage primaryStage) throws Exception {
		Donnees.chargementDonnees();
		
		
		fListe = new FenListeTrie();
		fZone = new FenListeZone();
		fCreaFaut = new FenCreaFaut();
		fCreaZ = new FenCreaZone();
		ctrlFaut = new controleurCreaFaut();
		//fListe.initModality(Modality.APPLICATION_MODAL);
		//fListe.show();
		//fCreaFaut.show();
		//fCreaZ.show();
		fZone.show();
	}
	
	public static void main(String args[]) {
		Application.launch();
	}
	
	static public void fermer() {
		System.exit(0);
	}
	
	static public void fermerListeZone() {
		System.exit(0);
	}
	
	static public void fermerCreaFaut() {
		fCreaFaut.close();
	}
	
	static public void fermerCreaZone() {
		fCreaZ.close();
	}
	
	static public void ouvrirCreaFaut() {
		fCreaFaut.show();
	}
	
	static public void ouvrirCreaZone() {
		fCreaZ.show();
	}
	
	
	static public void ouvrirListeFauteuil(Fauteuil f) {
		System.out.println("fauteuil creer");
		controleurZone controleurZone = new controleurZone();
		controleurZone.afficherImprime(f);
		fZone.show();
	}

	static public void supprimerAnnulation(AnnulationClient a) {
		// enregistrer la suppression
		Donnees.supprimerReservation(a);

	}
	
	static public void supFauteuil(Fauteuil a) {
		// enregistrer la suppression
		Donnees.supprimerFauteuil(a);
	}
	
	static public void ajoutZone(Zone z) {
		ctrlFaut =  fCreaFaut.getControleur();
		ctrlFaut.ajoutZone(z);
	}
	
}
