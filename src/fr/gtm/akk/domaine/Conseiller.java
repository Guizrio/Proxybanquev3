package fr.gtm.akk.domaine;

import java.util.*;

public class Conseiller {

	private int id;
	private String login;
	private String motDePasse;
	private String nom;
	private String prenom;
	Collection<Client> Clients;
	
	
	
	public Conseiller() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Conseiller(int id, String login, String motDePasse, String nom, String prenom, Collection<Client> clients) {
		super();
		this.id = id;
		this.login = login;
		this.motDePasse = motDePasse;
		this.nom = nom;
		this.prenom = prenom;
		Clients = clients;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getLogin() {
		return login;
	}



	public void setLogin(String login) {
		this.login = login;
	}



	public String getMotDePasse() {
		return motDePasse;
	}



	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public Collection<Client> getClients() {
		return Clients;
	}



	public void setClients(Collection<Client> clients) {
		Clients = clients;
	}
	
	
	
}