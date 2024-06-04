package lot9;

import java.util.Date;

public class AnnulationArtiste extends Annulation {
	private String nom;
	
	public AnnulationArtiste(Date d, Boolean b, String nom) {
		super(d, b);
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String toString() {
		return "AnnulationArtiste nom : " + nom;
	}
}
