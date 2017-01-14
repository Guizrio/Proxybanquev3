package fr.gtm.akk.dao;

import fr.gtm.akk.domaine.Compte;

public interface IcompteDao {
	
	public void createCompte();
	
	public Compte readCompte();

	public Compte updateCompte();
	
	public void deleteCompte();

}
