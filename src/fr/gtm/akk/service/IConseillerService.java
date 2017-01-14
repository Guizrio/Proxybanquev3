package fr.gtm.akk.service;

import fr.gtm.akk.domaine.Client;

public interface IConseillerService {

	Client afficherListeClients();

	/**
	 * 
	 * @param client
	 */
	Client afficherClient(Client client);

}