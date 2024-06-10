package controlleur;

import Fentetre.FenListeTrie;
import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class MainSae extends Application {
	static private FenListeTrie fListe;
	//static private FenNouvelEmploye fNouvel;



	public void start(Stage primaryStage) throws Exception {
		//Donnees.chargementDonnees();
		fListe = new FenListeTrie();
		//fNouvel = new FenNouvelEmploye();
		//fModifier = new FenModifierEmploye();
		//fNouvel.initModality(Modality.APPLICATION_MODAL);
		//fModifier.initModality(Modality.APPLICATION_MODAL);
		//fListe.initModality(Modality.APPLICATION_MODAL);
		fListe.show();
	}
	public static void main(String args[]) {
		Application.launch();
	}
	static public void fermer() {
		fListe.close();
	}
}
