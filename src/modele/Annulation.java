package modele;

import java.util.Date;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

public abstract class Annulation {
	private Date date;
	private BooleanProperty remboursementEffectue;
	private Reservation resa;
	
	public Annulation(Date d, Boolean b, Reservation r) {
		this.date = d;
		this.remboursementEffectue = new SimpleBooleanProperty(b);
		this.resa = r;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Boolean getRemboursementEffectue() {
		return remboursementEffectue.get();
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
