package lot8;

import java.util.Date;

public abstract class Annulation {
	private Date date;
	private Boolean remboursementEffectue;
	private Reservation resa;
	
	public Annulation(Date d, Boolean b, Reservation r) {
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

	public Boolean getRemboursementEffectue() {
		return remboursementEffectue;
	}

	public void setRemboursementEffectue(Boolean remboursementEffectue) {
		this.remboursementEffectue = remboursementEffectue;
	}

	public Reservation getResa() {
		return resa;
	}

	public void setResa(Reservation resa) {
		this.resa = resa;
	}
}
