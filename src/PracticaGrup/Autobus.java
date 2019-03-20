package PracticaGrup;

public abstract class Autobus{
	
	private int idNum;
	private Conductor conductor;
	
	public Autobus(int idNum, Conductor conductor) {
		this.idNum = idNum;
		this.conductor = conductor;
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

	public abstract double calculaPreu();
	
}
