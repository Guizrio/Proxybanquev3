package fr.gtm.akk.web;

import fr.gtm.akk.domaine.Compte;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "comptebean")
@SessionScoped
public class CompteBean implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Compte compte;

	// Constructeur

	public CompteBean(Compte compte) {
		super();
		this.compte = compte;
	}

	public CompteBean() {
		super();
	}
//
//	// Méthode
//	public void addAction() {
//		User user = new User(utilisateur.getPrenom(), utilisateur.getNom(), utilisateur.getGenre(),
//				utilisateur.getDatedenaissance(), utilisateur.getEmail(), utilisateur.getNiveaudeservice());
//		userList.add(user);
//		UserService usersrv = new UserService();
//		usersrv.createUser(user);
//	}
//
//	public void deleteAction() {
//
//	}
//	
//	// Getters & Setters
	
	

}

