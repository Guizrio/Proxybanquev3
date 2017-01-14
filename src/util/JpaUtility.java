package util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtility {

	private EntityManagerFactory emf;

	public EntityManagerFactory getEmf() {
		return emf;
	}

	public void setEmf(EntityManagerFactory emf) {
		this.emf = emf;
	}

	public JpaUtility(EntityManagerFactory emf) {
		super();
		this.emf = emf;
	}

	public JpaUtility() {
		super();
	}

	public EntityManagerFactory getEMF() {
		if (emf == null) {
			emf = Persistence.createEntityManagerFactory("proxibanque-pu");
		}
		return emf;
	}
}
