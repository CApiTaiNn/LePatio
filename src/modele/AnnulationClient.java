package modele;

import java.util.Date;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class AnnulationClient extends Annulation {
	private StringProperty nom;
	
	public AnnulationClient(Date d, Boolean b, Reservation r, String n) {
		super(d, b, r);
		this.nom = new SimpleStringProperty(n);
	}

	public StringProperty getNom() {
		return nom;
	}

	public void setNom(StringProperty nom) {
		this.nom = nom;
	}
	
	
}
