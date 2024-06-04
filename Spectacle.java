package lot9;

import java.util.ArrayList;

public class Spectacle {
	private String nom;
	private int duree;
	private int nbreMaxSpect;
	private Genre genre;
	private ArrayList<Artiste> lesArtistes;
	
	public Spectacle(String n, int d, int nbre, Genre g) {
		this.nom = n;
		this.duree = d;
		this.nbreMaxSpect = nbre;
		this.genre = g;
		lesArtistes = new ArrayList<>();
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
	
	
	public void ajouterArtiste(Artiste a) {
		if(a != null && !lesArtistes.contains(a)) {
			lesArtistes.add(a);
		}else {
			System.out.println("impossible d'ajouter cet artiste");
		}
	}
	
	public void suppArtiste(Artiste a) {
		if(a != null && lesArtistes.size() > 2) {
			lesArtistes.remove(a);
		}else {
			System.out.println("impossible de supprimé cet artiste");
		}
	}
	
}
