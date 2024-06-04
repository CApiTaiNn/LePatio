package lot9;

import java.util.ArrayList;

public abstract class Client {
	private String nom;
	private String prenom;
	private String adresse;
	private String Tel;
	private String mail;
	private String numero;
	private ArrayList<Reservation>mesresa;
	
	public Client(String n, String p, String a, String t, String m, String num) {
		this.nom = n;
		this.prenom = p;
		this.adresse = a;
		this.Tel = t;
		this.mail = m;
		this.numero = num;
		mesresa = new ArrayList<>();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTel() {
		return Tel;
	}

	public void setTel(String tel) {
		Tel = tel;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", Tel=" + Tel + ", mail=" + mail
				+ ", numero=" + numero + "]";
	}
	
	
}
