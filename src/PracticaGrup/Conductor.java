package PracticaGrup;

public class Conductor {
	
	private String nom;
	private double preuBase;
	
	public Conductor(String nom, double preuBase) {
		super();
		this.nom = nom;
		this.preuBase = preuBase;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPreuBase() {
		return preuBase;
	}

	public void setPreuBase(double preuBase) {
		this.preuBase = preuBase;
	}
}
