package modele;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Zone {
	private StringProperty nom;
	
	public Zone(String n) {
		this.nom = new SimpleStringProperty(n);
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
	
	public static Zone fromString(String zoneName) {
        // Implement the logic to convert the string to a Zone object
        // This can include validations, lookups, etc.
        return new Zone(zoneName);
    }
}
