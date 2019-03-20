package PracticaGrup;

public class main {

	public static void main(String[] args) {
		// Declaracion de objetos
		Conductor con1 = new Conductor("Jona",19000);
		Interurba bus1 = new Interurba(2, con1, 0.05, 1000);
		Urba bus2 = new Urba(3, con1, 0.4, 'A');
		Gestor ges = new Gestor();
		
		//Demostracion de funcionamiento
		System.out.println("Id del bus: " + bus1.getIdNum() + "\rKM: " + bus1.getKm() + "\rPreu del viatge: " + bus1.calculaPreu() + "\rEl conductor es: " + bus1.getConductor().getNom());
		ges.añadirBus(bus1);
		ges.añadirBus(bus2);
		System.out.println(ges.toString());
		
	}

}
