package ejercicio_2;

import java.util.ArrayList;
import java.util.ListIterator;

public class MainEjercicio2 {
	

	public static void main(String[] args) {
			
		ArrayList<Producto> listaProductos = new ArrayList<Producto>();
		listaProductos.add(new Pfrescos("01/01/2023",100,"01/01/2021","Argentina"));
		listaProductos.add(new Prefrigerados("02/02/2024",101,1001));
		listaProductos.add(new Pcongelados("03/03/2024",102,22));
		
		
		ListIterator<Producto> Lps = listaProductos.listIterator();
		while(Lps.hasNext()) {
			Producto Pr = Lps.next();
			System.out.println(Pr.toString());
		}		
	}
}
