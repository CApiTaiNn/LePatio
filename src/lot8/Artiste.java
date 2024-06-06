package lot8;

import java.util.ArrayList;

public class Artiste {
	private String nom;
	private ArrayList<Spectacle> spectacles;
	
	public Artiste(String n) {
		this.nom = n;
		spectacles = new ArrayList<>();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
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
