package lot9;

public class Representation {
	private String jour;
	private String heure;
	private Boolean annulee;
	private Reservation  
	
	public Representation(String j, String h, Boolean b) {
		this.jour = j;
		this.heure = h;
		this.annulee = b;
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
	
	
}
