package PracticaGrup;

public class Interurba extends Autobus{
	private double km;
	
	@Override
	public String toString() {
		return "Interurba [preuBase=" + preuBase + ", km=" + km + "]";
	}

	public void setPreuBase(double preuBase) {
		this.preuBase = preuBase;
	}
	public double getKm() {
		return km;
	}
	public void setKm(double km) {
		this.km = km;
	}

	public Interurba(int idNum, Conductor conductor, double preuBase, double km) {
		super(idNum, conductor);
		this.preuBase = preuBase;
		this.km = km;
	}
	
	
}
