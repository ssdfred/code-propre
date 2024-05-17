package ex1;

import java.util.Date;

/**
 * Classe entreprise permet d'ajouter un entreprise
 * 
 */
public class entreprise {

	/** siret */
	public int siret;
	/** nom	 */
	public String nom;
	/**	adresse */
	public String adresse;
	/** dateCreation */
	public Date dateCreation;
	
	/**Capiltal maximun 
	 * @params CapitalMax
	 */
	public static final int CapitalMax = 3000000;
	
	public void Afficher_statut(){
		
	}

	/** Getter pour siret
	 * @return the siret
	 */
	public int getSiret() {
		return siret;
	}

	/** Setter pour siret
	 * @param siret the siret to set
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	/** Getter pour nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter pour nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter pour adresse
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/** Setter pour adresse
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/** Getter pour dateCreation
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/** Setter pour dateCreation
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
}
