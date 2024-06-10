package modele;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

public class Reservation {
	private String numero;
	private Date date;
	private Date dateEnvoiConfDate;
	private HashSet<Billet> billets;
	private Client client;
	private Representation representation;
	private ArrayList<Annulation> lesAnnulation;
	
	public Reservation(String n, Date d1, Date d2, Client c) {
		this.numero = n;
		this.date = d1;
		this.dateEnvoiConfDate = d2;
		this.client = c;
		billets = new HashSet<>();
		lesAnnulation = new ArrayList<>();
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getDateEnvoiConfDate() {
		return dateEnvoiConfDate;
	}

	public void setDateEnvoiConfDate(Date dateEnvoiConfDate) {
		this.dateEnvoiConfDate = dateEnvoiConfDate;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String toString() {
		return "Numero : "+ this.numero + "|    Date : " + this.date + "|     DateConf : " + this.dateEnvoiConfDate + " |    Client : " + client.getNom();
	}
	
	public void ajouteBillet(Billet b) {
		if(b != null) {
			billets.add(b);
		}else {
			System.out.println("impossible d'ajouter le billet");
		}
	}
	
	public void suppBillet(Billet b) {
		if(b != null && billets.contains(b) && billets.size() > 1) {
			billets.remove(b);
		}else {
			System.out.println("impossible de supprimé le billet");
		}
	}
}
