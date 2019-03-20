package PracticaGrup;

public class Interurba extends Autobus {
	private double km;

	public double calculaPreu() {
		return getPreuBase() * km;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public Interurba(int idNum, Conductor conductor, double preuBase, double km) {
		super(idNum, conductor, preuBase);
		this.km = km;
	}

}
