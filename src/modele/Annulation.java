package modele;

import java.util.Date;

import javafx.beans.property.BooleanProperty;

public abstract class Annulation {
	private Date date;
	private BooleanProperty remboursementEffectue;
	private Reservation resa;
	
	public Annulation(Date d, BooleanProperty b, Reservation r) {
		this.date = d;
		this.remboursementEffectue = b;
		this.resa = r;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public BooleanProperty getRemboursementEffectue() {
		return remboursementEffectue;
	}

	public void setRemboursementEffectue(BooleanProperty remboursementEffectue) {
		this.remboursementEffectue = remboursementEffectue;
	}

	public Reservation getResa() {
		return resa;
	}

	public void setResa(Reservation resa) {
		this.resa = resa;
	}
}
