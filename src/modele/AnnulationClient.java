package modele;

import java.util.Date;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.StringProperty;

public class AnnulationClient extends Annulation {
	private StringProperty nom;
	
	public AnnulationClient(Date d, BooleanProperty b, Reservation r, StringProperty n) {
		super(d, b, r);
		this.nom = n;
	}

	public StringProperty getNom() {
		return nom;
	}

	public void setNom(StringProperty nom) {
		this.nom = nom;
	}
	
	
}
