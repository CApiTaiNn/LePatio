package lot9;

public class Spectacle {
	private String nom;
	private int duree;
	private int nbreMaxSpect;
	private Genre genre;
	
	public Spectacle(String n, int d, int nbre, Genre g) {
		this.nom = n;
		this.duree = d;
		this.nbreMaxSpect = nbre;
		this.genre = g;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public int getNbreMaxSpect() {
		return nbreMaxSpect;
	}

	public void setNbreMaxSpect(int nbreMaxSpect) {
		this.nbreMaxSpect = nbreMaxSpect;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Spectacle [nom=" + nom + ", duree=" + duree + ", nbreMaxSpect=" + nbreMaxSpect + "]";
	}
	
	
}
