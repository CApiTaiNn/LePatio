package modele;

import java.util.ArrayList;

public abstract class Genre {
	private String libelle;
	private ArrayList<Spectacle> spectacles;
	
	public Genre(String l) {
		this.libelle = l;
		spectacles = new ArrayList<>();
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
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
