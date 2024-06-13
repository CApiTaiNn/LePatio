package modele;


import java.util.Date;
import java.util.HashSet;

public class Reservation {
	private String numero;
	private Date date;
	private Date dateEnvoiConfDate;
	private HashSet<Billet> billets;
	private Client client;
	private Representation representation;
	private Annulation lesAnnulation;
	
	public Reservation(String n, Date d1, Date d2, Client c) {
		this.numero = n;
		this.date = d1;
		this.dateEnvoiConfDate = d2;
		this.client = c;
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
	

	public Representation getRepresentation() {
		return representation;
	}

	public void setRepresentation(Representation representation) {
		this.representation = representation;
	}

	public Date getDateEnvoiConfDate() {
		return dateEnvoiConfDate;
	}

	public void setDateEnvoiConfDate(Date dateEnvoiConfDate) {
		this.dateEnvoiConfDate = dateEnvoiConfDate;
	}
	
	public String getRepresInfo() {
        return representation.getSpecInfo();
    }
	
	public Client getClient() {
		return client;
	}
	
	public String getClientInfo() {
        return client.getNom() + "\n" + client.getNumero();
    }

	public void setClient(Client client) {
		this.client = client;
	}
	
	public String getBillet() {
        StringBuilder billetStr = new StringBuilder();
        for (Billet b : billets) {
            billetStr.append(b.toString()).append(", ");
        }
        if (billetStr.length() > 2) {
            billetStr.setLength(billetStr.length() - 2); // Supprime la dernière virgule et l'espace
        }
        String str = "\nNombre de billet : " + nbBillet();
        billetStr.append(str);
        return billetStr.toString();
    }
	
	
	public String lesBillet() {
		String str = "";
		for (Billet b : billets) {
			str.concat(b.toString());
		}
		return str;
	}
	
	public int nbBillet() {
		return billets.size();
	}
	
	
	//rajouter nb billet
	//rajouter nom spectacle
	
	
	public String toString() {
		return "Numero : "+ this.numero + "\nDate : " + this.date + "\nDateConf : " + this.dateEnvoiConfDate + "\nClient : " + client.getNom();
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
