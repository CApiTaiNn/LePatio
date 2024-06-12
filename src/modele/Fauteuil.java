package modele;

public class Fauteuil {
    private String rangee;
    private String numero;
    private Zone zone;

    public Fauteuil(String n, String r, Zone z) {
        this.rangee = r;
        this.numero = n;
        this.zone = z;
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

    @Override
    public String toString() {
        //return "Rangee : " + this.rangee + " | Numero : " + this.numero + " | Zone : " + this.zone.getNom();
        return this.numero + " | Rangée : " + this.rangee + " | " + this.zone.getNom();
    }	
}
