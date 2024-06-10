package lot8;

public class Zone {
	private String nom;
	
	public Zone(String n) {
		this.nom = n;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String toString() {
		return "Nom : "+ this.nom;
	}
}
