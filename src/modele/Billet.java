package modele;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Billet {
	private StringProperty numero;
	private Fauteuil fauteuil;
	private Reservation resa;
	
	public Billet(String num, Fauteuil f, Reservation r) {
		this.numero = new SimpleStringProperty(num);
		this.fauteuil = f;
		this.resa = r;
	}

	public StringProperty getNumero() {
		return numero;
	}

	public void setNumero(StringProperty numeroString) {
		this.numero = numeroString;
	}

	public Fauteuil getFauteuil() {
		return fauteuil;
	}

	public void setFauteuil(Fauteuil fauteuil) {
		this.fauteuil = fauteuil;
	}

	
	public Reservation getResa() {
		return resa;
	}

	public void setResa(Reservation resa) {
		this.resa = resa;
	}

	public String toString() {
		return "Numero : " + this.numero.get() + " | Fauteuil : " + this.fauteuil;
	}
	
}
