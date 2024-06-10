package modele;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Zone {
    private String nom;
    private Set<Spectacle> listSpectacles;
    private Map<String, Set<Fauteuil>> rangees;
    private Map<String, Integer> nextNumeroFauteuil;  // Pour garder la trace du prochain numéro de fauteuil pour chaque rangée

    public Zone(String n) {
        this.nom = n;
        this.listSpectacles = new HashSet<>();
        this.rangees = new HashMap<>();
        this.nextNumeroFauteuil = new HashMap<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Set<Spectacle> getListSpectacles() {
        return listSpectacles;
    }

    public void ajouterSpectacle(Spectacle s) {
        if (s != null && listSpectacles.add(s)) {
            s.ajouterZone(this);
        }
    }

    public void supprimerSpectacle(Spectacle s) {
        if (s != null && listSpectacles.remove(s)) {
            s.supprimerZone(this);
        }
    }

    public Set<Fauteuil> getFauteuilsByRangee(String rangee) {
        return rangees.getOrDefault(rangee, new HashSet<>());
    }

    public Fauteuil creerFauteuil(String rangee) {
        rangees.putIfAbsent(rangee, new HashSet<>());
        nextNumeroFauteuil.putIfAbsent(rangee, 1);

        int numero = nextNumeroFauteuil.get(rangee);
        Fauteuil fauteuil = new Fauteuil(rangee, String.valueOf(numero), this);
        rangees.get(rangee).add(fauteuil);
        nextNumeroFauteuil.put(rangee, numero + 1);

        return fauteuil;
    }

    public void supprimerFauteuil(String rangee) {
        Set<Fauteuil> fauteuils = rangees.get(rangee);
        if (fauteuils != null && !fauteuils.isEmpty()) {
            Fauteuil fauteuilToRemove = null;
            int highestNumber = 0;

            for (Fauteuil f : fauteuils) {
                int num = Integer.parseInt(f.getNumero());
                if (num > highestNumber) {
                    highestNumber = num;
                    fauteuilToRemove = f;
                }
            }

            if (fauteuilToRemove != null) {
                fauteuils.remove(fauteuilToRemove);
                nextNumeroFauteuil.put(rangee, highestNumber);
            }
        }
    }

    @Override
    public String toString() {
        return "Nom : " + this.nom;
    }
}
