package fr.gtm.akk.service;

import fr.gtm.akk.dao.ClientDao;
import fr.gtm.akk.domaine.Client;

public class ClientService implements IClientService {

	@Override
	public void ajouterClient(Client client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerClient(Client client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierClient(Client client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Client afficherClient(int id) {
		// TODO Auto-generated method stub
		Client rClient;
		rClient = new ClientDao().read(id);
		return rClient;
	}
}