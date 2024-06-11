package modele;

import java.util.HashSet;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Fauteuil {
	private StringProperty rangee;
	private StringProperty numero;
	private Zone zone;
	private HashSet<Billet> billets;
	
	public Fauteuil(String r, String n, Zone z) {
		this.rangee = new SimpleStringProperty(r);
		this.numero = new SimpleStringProperty(n);
		this.zone = z;
		billets = new HashSet<>();
	}

	public String getRangee() {
		return rangee.get();
	}

	public void setRangee(String rangee) {
		this.rangee.set(rangee);
	}

	public String getNumero() {
		return numero.get();
	}

	public void setNumero(String numero) {
		this.numero.set(numero);
	}
	
	public Zone getZone() {
		return zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}

	public String toString() {
		return "Rangee : " + this.rangee + "|   Numero : " + this.numero + " |    Zone : " + this.zone;
	}
}
