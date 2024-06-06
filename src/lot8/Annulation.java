package lot8;

import java.util.Date;

public abstract class Annulation {
	private Date date;
	private Boolean remboursementEffectue;
	
	public Annulation(Date d, Boolean b) {
		this.date = d;
		this.remboursementEffectue = b;
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
	
	
}
