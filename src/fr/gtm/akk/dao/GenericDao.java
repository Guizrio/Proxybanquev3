package fr.gtm.akk.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GenericDao<T> {

	// !!! À MODIFIER EN FONCTION DE PERSISTENCE.XML
	// Nom de l'unité de persistance
	private final String persistenceUnit = "proxibanque-pu";
	protected Class<T> entityClass;
	protected EntityManager em;

	public void create(T object) {

		// Début de la transaction avec la BDD
		EntityTransaction tx = this.em.getTransaction();
		tx.begin();

		// Création d'un enregistrement de formation dans la BDD
		this.em.persist(object);

		// Fermeture de la transaction, du gestionnaire d'entité et de sa fabrique
		tx.commit();
	}

	public T read(Object primaryKey) {

		EntityTransaction tx = this.em.getTransaction();
		tx.begin();

		// Création d'un enregistrement de formation dans la BDD
		T returnedObject = (T) this.em.find(this.entityClass, primaryKey);

		tx.commit();
		
		return returnedObject;
	}

	public T update(T object) {

		EntityTransaction tx = this.em.getTransaction();
		tx.begin();

		// Création d'un enregistrement de formation dans la BDD
		T returnedObject = (T) this.em.merge(object);

		tx.commit();
		
		return returnedObject;
	}
	
	public void delete(T object) {

		EntityTransaction tx = this.em.getTransaction();
		tx.begin();

		// Suppression d'un enregistrement dans la BDD
		this.em.remove(object);

		tx.commit();
	}
	
	
}
