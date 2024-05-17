package ex2;

/**
 * Représente un compte bancaire avec un solde.
 * Les classes dérivées peuvent ajouter des comportements spécifiques.
 * La méthode ajouterMontant permet de créditer un montant sur le compte.
 * La méthode debiterMontant permet de débiter un montant sur le compte en fonction des règles spécifiques au type de compte.
 * @autor DIGINAMIC
 */
public abstract class CompteBancaire {  // La classe est maintenant abstraite pour permettre une spécialisation par type de compte.

    /** solde : solde du compte */
    protected double solde;  // Utilisation de 'protected' pour permettre l'accès direct dans les sous-classes.

    /**
     * @param solde Le solde initial du compte
     */
    public CompteBancaire(double solde) {
        this.solde = solde;
    }

    /** Ajoute un montant au solde
     * @param montant Le montant à ajouter
     */
    public void ajouterMontant(double montant) {
        this.solde += montant;
    }

    /** Débite un montant du solde selon les règles spécifiques du compte
     * @param montant Le montant à débiter
     */
    public abstract void debiterMontant(double montant);  // Méthode abstraite pour forcer les sous-classes à implémenter leur propre logique de débit.

    /** Getter for solde
     * @return le solde
     */
    public double getSolde() {
        return solde;
    }

    /** Setter for solde
     * @param solde Le nouveau solde
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }
}
