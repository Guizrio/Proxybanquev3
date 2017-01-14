package fr.gtm.akk.service;

import fr.gtm.akk.domaine.Client;

public interface IClientService {

	Client afficherClient(int idClient);
	/**
	 * 
	 * @param client
	 */
	void ajouterClient(Client client);

	/**
	 * 
	 * @param client
	 */
	void supprimerClient(Client client);

	/**
	 * 
	 * @param client
	 */
	void modifierClient(Client client);

}