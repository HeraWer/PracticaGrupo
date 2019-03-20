package PracticaGrup;

public class Autobus{
	
	private int idNum;
	private Conductor conductor;
	private double preuBase;
	
	public Autobus(int idNum, Conductor conductor, double preuBase) {
		this.idNum = idNum;
		this.conductor = conductor;
		this.preuBase = preuBase;
	}

	public int getIdNum() {
		return idNum;
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

	public double getPreuBase() {
		return preuBase;
	}

	public void setPreuBase(double preuBase) {
		this.preuBase = preuBase;
	}
	
	public double calculaPreu() {
		return 2.3;
	}
	
}
