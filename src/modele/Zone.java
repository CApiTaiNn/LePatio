package modele;

import javafx.beans.property.StringProperty;

public class Zone {
	private StringProperty nom;
	
	public Zone(StringProperty n) {
		this.nom = n;
	}

	public StringProperty getNom() {
		return nom;
	}

	public void setNom(StringProperty nom) {
		this.nom = nom;
	}
	
	public String toString() {
		return "Nom : "+ this.nom;
	}
}
