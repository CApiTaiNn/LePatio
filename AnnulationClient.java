package lot9;

import java.util.Date;

public class AnnulationClient extends Annulation {
	private String nom;
	
	public AnnulationClient(Date d, Boolean b, String n) {
		super(d, b);
		this.nom = n;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
