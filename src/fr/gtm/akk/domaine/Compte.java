package fr.gtm.akk.domaine;

public abstract class Compte {
	
	private int idCompte;
	private String numero;
	private double solde;
	
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Compte(int idCompte, String numero, double solde) {
		super();
		this.idCompte = idCompte;
		this.numero = numero;
		this.solde = solde;
	}

	public int getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	
	
}