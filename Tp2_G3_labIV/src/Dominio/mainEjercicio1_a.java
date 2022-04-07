package Dominio;

import java.util.ArrayList;
import java.util.ListIterator;

public class mainEjercicio1_a {

	public static void main(String[] args) {
		ArrayList<Profesor> ListaDeProfesores = new ArrayList<Profesor>(5);
		ListaDeProfesores.add(new Profesor("PR1",30,"Titular",10));
		ListaDeProfesores.add(new Profesor("PR2",32,"Suplente",12));
		ListaDeProfesores.add(new Profesor("PR3",31,"Titular",11));
		ListaDeProfesores.add(new Profesor("PR4",33,"Titular",13));
		ListaDeProfesores.add(new Profesor("PR5",34,"Suplente",14));
		
		ListIterator<Profesor> Li = ListaDeProfesores.listIterator();
		
		while (Li.hasNext()) {
			Profesor Pr = Li.next();  
			System.out.println(Pr.toString());
		}
		
		Profesor p1 = new Profesor("PR6",35,"Titular",15);
		Profesor p2 = new Profesor("PR6",35,"Titular",15);
		
		if(p1.equals(p2)) {
			System.out.println("Es el mismo profesor.");
		}else {
			System.out.println("No es el mismo profesor.");
		}
		
	}

}