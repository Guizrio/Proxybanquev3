package fr.gtm.akk.web;

import java.io.Serializable;
import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


import fr.gtm.akk.domaine.Client;
import fr.gtm.akk.service.ClientService;

@ManagedBean(name = "clientbean")
@SessionScoped
public class ClientBean implements Serializable {

		// Propriétés
		private static final long serialVersionUID = 1L;
		private Client client = new Client();
		
		//Méthodes
		public Client lireClient(int idClient) throws SQLException{
			Client rClient = new ClientService().afficherClient(idClient);
			return rClient;
		}
		// Constructeur
		
		public ClientBean() {
			super();
			// TODO Auto-generated constructor stub

		}

		// Getters & Setters

		public ClientBean(Client client) {
			super();
			this.client = client;
		}

		public Client getClient() {
			return client;
		}

		public void setClient(Client client) {
			this.client = client;
		}

}
