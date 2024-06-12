package controleur;

import vue.FenCreaFaut;
import vue.FenCreaZone;
import vue.FenListeTrie;
import vue.FenListeFauteuil;
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
	static private FenListeFauteuil fListeFauteuil;
	static private FenCreaFaut fCreaFaut;
	static private FenCreaZone fCreaZ;
	
    static private controleurCreaFaut ctrlFaut;
    static private controleurZone ctrlZone;



	public void start(Stage primaryStage) throws Exception {
		Donnees.chargementDonnees();
		
		
		fListe = new FenListeTrie();
		fListeFauteuil = new FenListeFauteuil();
		fCreaFaut = new FenCreaFaut();
		fCreaZ = new FenCreaZone();
		ctrlFaut = new controleurCreaFaut();
		ctrlZone = new controleurZone();
		//fListe.initModality(Modality.APPLICATION_MODAL);
		fListe.show();
		//fCreaFaut.show();
		//fCreaZ.show();
		//fListeFauteuil.show();
	}
	
	public static void main(String args[]) {
		Application.launch();
	}
	
	static public void fermer() {
		System.exit(0);
	}
	
	static public void fermerListeFauteuil() {
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
		ctrlZone = fListeFauteuil.getControleur();
		ctrlZone.afficherImprime(f);
		Donnees.ajoutFauteuil(f);
		fCreaFaut.close();
		fListeFauteuil.show();
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
		fCreaZ.close();
		ctrlFaut =  fCreaFaut.getControleur();
		ctrlFaut.ajoutZone(z);
	}
	
}
