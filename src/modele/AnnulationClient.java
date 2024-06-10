package modele;

import java.util.Date;

public class AnnulationClient extends Annulation {
	private String nom;
	
	public AnnulationClient(Date d, Boolean b, Reservation r, String n) {
		super(d, b, r);
		this.nom = n;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
