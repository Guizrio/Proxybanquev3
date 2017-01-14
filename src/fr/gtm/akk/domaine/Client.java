package fr.gtm.akk.domaine;

import java.util.*;

public class Client {

	private int id;
	private String nom;
	private String prenom;
	private String email;
	private String adresse;
	Collection<Compte> Comptes;
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Client(int id, String nom, String prenom, String email, String adresse, Collection<Compte> comptes) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
		Comptes = comptes;
	}
	
	public Client(int id, String nom, String prenom, String email, String adresse) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Collection<Compte> getComptes() {
		return Comptes;
	}

	public void setComptes(Collection<Compte> comptes) {
		Comptes = comptes;
	}
	
}