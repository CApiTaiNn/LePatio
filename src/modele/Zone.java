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
    private int prochainIndiceRangee;

    public Zone(String n, int x) {
        this.nom = n;
        this.listSpectacles = new HashSet<>();
        this.rangees = new HashMap<>();
        this.nextNumeroFauteuil = new HashMap<>();
        this.prochainIndiceRangee = 0;

        for (int i = 0; i < x; i++) {
            ajouterRangee();
        }
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

    public void ajouterRangee() {
        char lettreRangee = (char) ('A' + prochainIndiceRangee);
        String rangee = String.valueOf(lettreRangee);
        rangees.putIfAbsent(rangee, new HashSet<>());
        nextNumeroFauteuil.putIfAbsent(rangee, 1);
        prochainIndiceRangee++;
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
                nextNumeroFauteuil.put(rangee, highestNumber);  // Met à jour le prochain numéro de fauteuil
            }
        }
    }
    
    public void afficherRangeesEtFauteuils() {
        for (Map.Entry<String, Set<Fauteuil>> entry : rangees.entrySet()) {
            String rangee = entry.getKey();
            Set<Fauteuil> fauteuils = entry.getValue();

            System.out.println("Rangée : " + rangee);
            for (Fauteuil fauteuil : fauteuils) {
                System.out.println("\t" + fauteuil);
            }
        }
    }
    
    public void afficherZone() {
        System.out.println("Zone : " + nom);
        afficherRangeesEtFauteuils();
    }

    @Override
    public String toString() {
        return "Nom : " + this.nom;
    }
}
