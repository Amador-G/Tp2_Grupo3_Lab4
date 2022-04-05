package Dominio;

import java.util.SortedSet;
import java.util.TreeSet;

public class mainEjercicio1_b {

	public static void main(String[] args) {
		
		SortedSet<Profesor> listaProfesores = new TreeSet<Profesor>();
		listaProfesores.add(new Profesor("PR1",30,"Titular",10));
		listaProfesores.add(new Profesor("PR2",32,"Suplente",12));
		listaProfesores.add(new Profesor("PR3",31,"Titular",11));
		listaProfesores.add(new Profesor("PR4",33,"Titular",13));
		listaProfesores.add(new Profesor("PR5",34,"Suplente",14));
		
		
		System.out.println("Lista de Profesores: \n");
		
		for (Profesor x: listaProfesores) {
			System.out.println(x.toString());
		}
	}
}


