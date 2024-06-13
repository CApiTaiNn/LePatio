package modele;

import java.util.ArrayList;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public abstract class Genre {
	private StringProperty libelle;
	private ArrayList<Spectacle> spectacles;
	
	public Genre(String l) {
		this.libelle = new SimpleStringProperty(l);
		spectacles = new ArrayList<>();
	}

	public String getLibelle() {
		return libelle.get();
	}

	public void setLibelle(StringProperty libelle) {
		this.libelle = libelle;
	}


	public void ajouterSpec(Spectacle s){
		if(s != null && !spectacles.contains(s)){
			spectacles.add(s);
		}else{
			System.out.println("Impossible d'ajouter ce spetacle");
		}
	}


	public void suppSpec(Spectacle s){
		if(s != null && spectacles.contains(s)){
			spectacles.remove(s);
		}else{
			System.out.println("Impossible de supprimé ce spetacle");
		}
	}
}
