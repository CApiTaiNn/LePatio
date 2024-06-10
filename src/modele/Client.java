package modele;

import java.util.ArrayList;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public abstract class Client {
	private StringProperty nom;
	private StringProperty prenom;
	private StringProperty adresse;
	private StringProperty Tel;
	private StringProperty mail;
	private StringProperty numero;
	private ArrayList<Reservation>mesResa;
	
	public Client(String n, String p, String a, String t, String m, String num) {
		this.nom = new SimpleStringProperty(n);
		this.prenom = new SimpleStringProperty(p);
		this.adresse = new SimpleStringProperty(a);
		this.Tel = new SimpleStringProperty(t);
		this.mail = new SimpleStringProperty(m);
		this.numero = new SimpleStringProperty(num);
		mesResa = new ArrayList<>();
	}

	public String getNom() {
		return nom.get();
	}

	public void setNom(StringProperty nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom.get();
	}

	public void setPrenom(StringProperty prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse.get();
	}

	public void setAdresse(StringProperty adresse) {
		this.adresse = adresse;
	}

	public String getTel() {
		return Tel.get();
	}

	public void setTel(StringProperty tel) {
		Tel = tel;
	}

	public String getMail() {
		return mail.get();
	}

	public void setMail(StringProperty mail) {
		this.mail = mail;
	}

	public String getNumero() {
		return numero.get();
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
