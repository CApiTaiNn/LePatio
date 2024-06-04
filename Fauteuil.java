package lot9;

import java.util.HashSet;

public class Fauteuil {
	private String rangee;
	private String numero;
	private Zone zone;
	private HashSet<Billet> billets;
	
	public Fauteuil(String r, String n, Zone z) {
		this.rangee = r;
		this.numero = n;
		this.zone = z;
		billets = new HashSet<>();
	}

	public String getRangee() {
		return rangee;
	}

	public void setRangee(String rangee) {
		this.rangee = rangee;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
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
