package modele;

import java.util.ArrayList;

public abstract class Client {
	private String nom;
	private String prenom;
	private String adresse;
	private String Tel;
	private String mail;
	private String numero;
	private ArrayList<Reservation>mesResa;
	
	public Client(String n, String p, String a, String t, String m, String num) {
		this.nom = n;
		this.prenom = p;
		this.adresse = a;
		this.Tel = t;
		this.mail = m;
		this.numero = num;
		mesResa = new ArrayList<>();
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


	public void ajouterResa(Reservation r){
		if(r != null && !mesResa.contains(r)){
			mesResa.add(r);
		}else{
			System.out.println("Impossible d'ajouter cette resa");
		}
	}

	public void suppResa(Reservation r){
		if(r != null & mesResa.contains(r) && mesResa.size() > 1){
			mesResa.remove(r);
		}else{
			System.out.println("Impossible de suprrimer cette resa");
		}
	}
	
}
