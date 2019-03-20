package PracticaGrup;

public class Urba extends Autobus {

	private char ruta;

	public Urba(int idNum, Conductor conductor, double preuBase, char ruta) {
		super(idNum, conductor, preuBase);
		this.ruta = ruta;
	}

	public double calculaPreu() {
		if (ruta == 'a' || ruta == 'A') {
			return getPreuBase() * 1.1;
		} else {
			return getPreuBase() * 1.2;
		}
	}

	public char getRuta() {
		return ruta;
	}

	public void setRuta(char ruta) {
		this.ruta = ruta;
	}

}
