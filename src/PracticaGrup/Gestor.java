package PracticaGrup;

import java.util.ArrayList;

public class Gestor {

	ArrayList<Autobus> gestor = new ArrayList<Autobus>();

	public Gestor() {
		super();
		}
	
	@Override
	public String toString() {
		return "Gestor [gestor=" + gestor + "]";
	}

	public void añadirBus(Autobus bus) {
		gestor.add(bus);
	}
	
	public void eliminarBus(int id) {
		for(Autobus bus:gestor) {
			if(bus.getIdNum() == id) {
				gestor.remove(bus);
				break;
			}
		}
	}
}
