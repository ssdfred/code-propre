package ex2;

/**
 * Représente un compte courant avec un découvert autorisé.
 */
public class CompteCourant extends CompteBancaire {  // Spécialisation de CompteBancaire pour les comptes courants.

    /** decouvert : un découvert est autorisé pour les comptes courants */
    private double decouvert;

    /**
     * @param solde Le solde initial du compte
     * @param decouvert Le découvert autorisé
     */
    public CompteCourant(double solde, double decouvert) {
        super(solde);
        this.decouvert = decouvert;
    }

    @Override
    public void debiterMontant(double montant) {
        // Pour les comptes courants, vérifier le découvert autorisé.
        if (this.solde - montant >= -decouvert) {
            this.solde -= montant;
        }
    }

    /** Getter for decouvert
     * @return le découvert autorisé
     */
    public double getDecouvert() {
        return decouvert;
    }

    /** Setter for decouvert
     * @param decouvert Le nouveau découvert autorisé
     */
    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }
}
