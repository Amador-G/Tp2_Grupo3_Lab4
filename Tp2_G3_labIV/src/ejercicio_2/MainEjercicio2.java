package ejercicio_2;

public class MainEjercicio2 {

	public static void main(String[] args) {

		Pfrescos pf = new Pfrescos();
		System.out.println(pf.toString());
		Prefrigerados pr = new Prefrigerados();
		pr.setOrganismoSupervicionAlimentario(10);
		System.out.println(pr.toString());
		

	}

}
