package PracticaGrup;

public class Interurba extends Autobus{
	private double preuBase;
	private double km;
	
	public double calculaPreu() {
		return preuBase * km;
	}
	
	public double getPreuBase() {
		return preuBase;
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
