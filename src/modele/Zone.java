package modele;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Zone {
	private StringProperty nom;
	private StringProperty nbrange;
	
	public Zone(String n, String nb) {
		this.nom = new SimpleStringProperty(n);
		this.nbrange = new SimpleStringProperty(nb);
	}

	public StringProperty getNom() {
		return nom;
	}

	public void setNom(StringProperty nom) {
		this.nom = nom;
	}
	
	public StringProperty getNb() {
		return nbrange;
	}

	public void setNRange(StringProperty nb) {
		this.nbrange = nb;
	}
	
	public String toString() {
		return "Nom : "+ this.nom;
	}
	
	
	
	public static Zone fromString(String zoneName, String nb) {
        return new Zone(zoneName, nb);
    }
}
