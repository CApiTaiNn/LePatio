package modele;

import java.util.ArrayList;

import javafx.beans.property.StringProperty;

public abstract class Client {
	private StringProperty nom;
	private StringProperty prenom;
	private StringProperty adresse;
	private StringProperty Tel;
	private StringProperty mail;
	private StringProperty numero;
	private ArrayList<Reservation>mesResa;
	
	public Client(StringProperty n, StringProperty p, StringProperty a, StringProperty t, StringProperty m, StringProperty num) {
		this.nom = n;
		this.prenom = p;
		this.adresse = a;
		this.Tel = t;
		this.mail = m;
		this.numero = num;
		mesResa = new ArrayList<>();
	}

	public StringProperty getNom() {
		return nom;
	}

	public void setNom(StringProperty nom) {
		this.nom = nom;
	}

	public StringProperty getPrenom() {
		return prenom;
	}

	public void setPrenom(StringProperty prenom) {
		this.prenom = prenom;
	}

	public StringProperty getAdresse() {
		return adresse;
	}

	public void setAdresse(StringProperty adresse) {
		this.adresse = adresse;
	}

	public StringProperty getTel() {
		return Tel;
	}

	public void setTel(StringProperty tel) {
		Tel = tel;
	}

	public StringProperty getMail() {
		return mail;
	}

	public void setMail(StringProperty mail) {
		this.mail = mail;
	}

	public StringProperty getNumero() {
		return numero;
	}

	public void setNumero(StringProperty numero) {
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
