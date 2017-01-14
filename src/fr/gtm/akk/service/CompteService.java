package fr.gtm.akk.service;

import fr.gtm.akk.dao.CompteDao;
import fr.gtm.akk.domaine.Compte;

public class CompteService implements ICompteService {

	@Override
	public boolean virementCaC(Compte compteDebite, Compte compteCredite, double montant) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void creerCompte(Compte compte) {
		// TODO Auto-generated method stub
		new CompteDao().create(compte);
	}

	@Override
	public void supprimerCompte(Compte compte) {
		// TODO Auto-generated method stub
		new CompteDao().delete(compte);
	}
}