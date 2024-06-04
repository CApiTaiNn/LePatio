package lot9;

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
	
	
}
