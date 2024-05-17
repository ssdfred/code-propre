package ex2;

/**
 * Représente un livret A avec un taux de rémunération annuel.
 * Un livret A ne peut jamais être à découvert.
 */
public class LivretA extends CompteBancaire {  // Spécialisation de CompteBancaire pour les livrets A.

    /** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
    private double tauxRemuneration;

    /**
     * @param solde représente le solde du compte
     * @param tauxRemuneration représente le taux de rémunération du livret A
     */
    public LivretA(double solde, double tauxRemuneration) {
        super(solde);
        this.tauxRemuneration = tauxRemuneration;
    }

    @Override
    public void debiterMontant(double montant) {
        // Pour les livrets A, pas de découvert autorisé.
        if (this.solde - montant >= 0) {
            this.solde -= montant;
        }
    }

    /** Applique la rémunération annuelle au solde */
    public void appliquerRemunerationAnnuelle() {
        setSolde(getSolde() + getSolde() * tauxRemuneration / 100);
    }

    /** Getter for tauxRemuneration
     * @return le taux de rémunération
     */
    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    /** Setter for tauxRemuneration
     * @param tauxRemuneration Le nouveau taux de rémunération
     */
    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }
}
