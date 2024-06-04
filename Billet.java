package lot9;

public class Billet {
	private String numero;
	private Fauteuil fauteuil;
	private Reservation resa;
	
	public Billet(String num, Fauteuil f, Reservation r) {
		this.numero = num;
		this.fauteuil = f;
		this.resa = r;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numeroString) {
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
		return "Numero : " + this.numero + "|    Fauteuil : " + this.fauteuil;
	}
	
}
