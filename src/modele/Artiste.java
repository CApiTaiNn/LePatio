package modele;

import java.util.ArrayList;

import javafx.beans.property.StringProperty;

public class Artiste {
	private StringProperty nom;
	private ArrayList<Spectacle> spectacles;
	
	public Artiste(StringProperty n) {
		this.nom = n;
		spectacles = new ArrayList<>();
	}

	public StringProperty getNom() {
		return nom;
	}

	public void setNom(StringProperty nom) {
		this.nom = nom;
	}
	
	public void ajouterSpectacle(Spectacle s) {
		if(s != null && !spectacles.contains(s)) {
			spectacles.add(s);
		}else {
			System.out.println("impossible d'ajouter ce spectacle");
		}
	}
	
	public void suppArtiste(Spectacle s) {
		if(s != null && spectacles.size() > 2) {
			spectacles.remove(s);
		}else {
			System.out.println("impossible de supprimé ce spectacle");
		}
	}
}
