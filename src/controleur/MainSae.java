package controlleur;

import vue.FenCreaZ;
import vue.FenCreaZone;
import vue.FenListeTrie;
import vue.FenListeZone;
import javafx.application.Application;
//import javafx.stage.Modality;
import javafx.stage.Stage;


public class MainSae extends Application {
	static private FenListeTrie fListe;
	static private FenListeZone fZone;
	static private FenCreaZone fCreaFaut;
	static private FenCreaZ fCreaZ;



	public void start(Stage primaryStage) throws Exception {
		//Donnees.chargementDonnees();
		fListe = new FenListeTrie();
		fZone = new FenListeZone();
		fCreaFaut = new FenCreaZone();
		fCreaZ = new FenCreaZ();
		//fNouvel = new FenNouvelEmploye();
		//fModifier = new FenModifierEmploye();
		//fNouvel.initModality(Modality.APPLICATION_MODAL);
		//fModifier.initModality(Modality.APPLICATION_MODAL);
		//fListe.initModality(Modality.APPLICATION_MODAL);
		//fListe.show();
		fCreaFaut.show();
		//fCreaZ.show();
		//fZone.show();
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
}
