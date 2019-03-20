package PracticaGrup;

public abstract class Urba extends Autobus{

	private double preuBase;
	private char ruta;
	
	public Urba(int idNum, Conductor conductor, double preuBase, char ruta) {
		super(idNum, conductor);
		this.preuBase = preuBase;
		this.ruta = ruta;
	}

	public double calculaPreu() {
		if (ruta == 'a' || ruta == 'A') {
			return preuBase*1.1;
		} else {
			return preuBase*1.2;
		}
	}

	public double getPreuBase() {
		return preuBase;
	}

	public void setPreuBase(double preuBase) {
		this.preuBase = preuBase;
	}

	public char getRuta() {
		return ruta;
	}

	public void setRuta(char ruta) {
		this.ruta = ruta;
	}
	
}
