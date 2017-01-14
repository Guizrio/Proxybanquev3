package fr.gtm.akk.service;

import fr.gtm.akk.domaine.Compte;

public interface ICompteService {

	/**
	 * 
	 * @param compteDebite
	 * @param compteCredite
	 * @param montant
	 */
	boolean virementCaC(Compte compteDebite, Compte compteCredite, double montant);

	/**
	 * 
	 * @param compte
	 */
	void creerCompte(Compte compte);

	/**
	 * 
	 * @param compte
	 */
	void supprimerCompte(Compte compte);

}