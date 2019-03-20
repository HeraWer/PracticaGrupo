package PracticaGrup;

public class Conductor {

	private String nom;
	private double salari;

	public Conductor(String nom, double salari) {
		super();
		this.nom = nom;
		this.salari = salari;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getsalari() {
		return salari;
	}

	public void setsalari(double salari) {
		this.salari = salari;
	}
}
