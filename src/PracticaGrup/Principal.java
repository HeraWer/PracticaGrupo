package PracticaGrup;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaració d'objectes
		Conductor con1 = new Conductor("Jona", 19000);
		Conductor con2 = new Conductor("Jona", 19000);
		Interurba bus1 = new Interurba(1, con1, 0.05, 1000);
		Urba bus2 = new Urba(2, con1, 0.5, 'A');
		
		Gestor gestor = new Gestor();

		// Programa de control
		
		
		System.out.println("Id del bus: " + bus1.getIdNum() + "\rKm: " + bus1.getKm() + "\rPreu del viatge: "
				+ bus1.calculaPreu() + "\rConductor: ");

	}

}
