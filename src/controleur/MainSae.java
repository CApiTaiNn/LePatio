package controleur;

import vue.FenCreaFaut;
import vue.FenCreaZone;
import vue.FenListeTrie;
import vue.FenListeFauteuil;
import vue.controleurCreaFaut;
import vue.controleurListeAnnulation;
import vue.controleurZone;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
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
    static private controleurListeAnnulation ctrlListe;



	public void start(Stage primaryStage) throws Exception {
		Donnees.chargementDonnees();
		
		
		fListe = new FenListeTrie();
		fListeFauteuil = new FenListeFauteuil();
		fCreaFaut = new FenCreaFaut();
		fCreaZ = new FenCreaZone();
		ctrlFaut = new controleurCreaFaut();
		ctrlZone = new controleurZone();
		ctrlListe = new controleurListeAnnulation();
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
		fListeFauteuil.close();
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
	
	static public void ouvrirListeFauteuil() {
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
	
	static public void triAnnulation(String n) {
		Donnees.listeFiltrer(n);
	}
	
	public static boolean zoneExists(String zoneName) {
        if (ctrlFaut != null) {
            MenuButton choixZone = ctrlFaut.getChoixZone();
            if (choixZone != null && choixZone.getItems() != null) {
                for (MenuItem item : choixZone.getItems()) {
                    if (item.getText().equals(zoneName)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
	
	public static controleurCreaFaut getControleurCreaFaut() {
		return ctrlFaut;
	}
}

	
