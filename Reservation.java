package lot9;

import java.util.Date;
import java.util.HashSet;

public class Reservation {
	private String numero;
	private Date date;
	private Date dateEnvoiConfDate;
	private HashSet<Billet> billets;
	
	public Reservation(String n, Date d1, Date d2) {
		this.numero = n;
		this.date = d1;
		this.dateEnvoiConfDate = d2;
		billets = new HashSet<>();
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
	
	public String toString() {
		return "Numero : "+ this.numero + "|    Date : " + this.date + "|     DateConf : " + this.dateEnvoiConfDate;
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
