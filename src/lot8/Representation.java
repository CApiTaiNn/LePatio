package lot8;

import java.util.ArrayList;

public class Representation {
	private String jour;
	private String heure;
	private Boolean annulee;
	private ArrayList<Reservation> lesResa;
	private Spectacle spectacle;
	
	public Representation(String j, String h, Boolean b, Spectacle s) {
		this.jour = j;
		this.heure = h;
		this.annulee = b;
		this.spectacle = s;
		lesResa = new ArrayList<>();
	}

	public String getJour() {
		return jour;
	}

	public void setJour(String jour) {
		this.jour = jour;
	}

	public String getHeure() {
		return heure;
	}

	public void setHeure(String heure) {
		this.heure = heure;
	}

	public Boolean getAnnulee() {
		return annulee;
	}

	public void setAnnulee(Boolean annulee) {
		this.annulee = annulee;
	}




	public void ajouterResa(Reservation r){
		if(r != null && !lesResa.contains(r)){
			lesResa.add(r);
		}else{
			System.out.println("Impossible d'ajouter cette resa");
		}
	}


	public void suppResa(Reservation r){
		if(r != null && lesResa.contains(r)){
			lesResa.remove(r);
		}else{
			System.out.println("Impossible de supprimé cette resa");
		}
	}
	
}
