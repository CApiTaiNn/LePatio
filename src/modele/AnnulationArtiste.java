package modele;

import java.util.Date;
import javafx.beans.property.StringProperty;

public class AnnulationArtiste extends Annulation {
	private StringProperty nom;
	
	public AnnulationArtiste(Date d, Boolean b,Reservation r, StringProperty nom) {
		super(d, b, r);
		this.nom = nom;
	}

	public StringProperty getNom() {
		return nom;
	}

	public void setNom(StringProperty nom) {
		this.nom = nom;
	}

	public String toString() {
		return "AnnulationArtiste nom : " + nom;
	}
}
