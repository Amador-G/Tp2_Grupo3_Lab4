package ejercicio_3;

import java.util.ArrayList;

public class mainEjercicio3 {

	public static void main(String[] args) {
		
	ArrayList<Edificio> listaEdificio = new ArrayList<Edificio>(5);
	listaEdificio.add(new EdificioDeOficinas(40, 800.2));
	listaEdificio.add(new EdificioDeOficinas(10, 20.2));
	listaEdificio.add(new Polideportivo("Polideportivo N1", 1200));
	listaEdificio.add(new Polideportivo("Polideportivo N2", 1500));
	listaEdificio.add(new Polideportivo("Polideportivo N3", 900));
	
	java.util.ListIterator<Edificio> it = listaEdificio.listIterator();
	while (it.hasNext()) {
		Edificio edificio = it.next();
		it.remove();
		System.out.print(edificio.toString());
	}
	

	}

}
