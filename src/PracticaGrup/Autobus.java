package PracticaGrup;

public abstract class Autobus{
	
	private int idNum;
	private Conductor conductor;
	private double preuBase;
	
	public Autobus(int idNum, Conductor conductor, double preuBase) {
		this.idNum = idNum;
		this.conductor = conductor;
	}

	public int getIdNum() {
		return idNum;
	}

	public double getPreuBase() {
		return preuBase;
	}

	public void setPreuBase(double preuBase) {
		this.preuBase = preuBase;
	}

	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}

	public Conductor getConductor() {
		return conductor;
	}

	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}

	public abstract double calculaPreu();
	
}
