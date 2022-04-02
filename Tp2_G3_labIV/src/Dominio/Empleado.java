package Dominio;

public abstract class Empleado {
	private final int id;
	private String nombre;
	private int edad;
	private static int cont = 1000;
		
	
	
	public Empleado(){
		cont++;
		this.id = cont;
		this.nombre = "Sin nombre";
		this.edad = 99;
	}
	
	public Empleado(String nombre, int edad){
		cont++;
		this.id = cont;
		this.nombre = nombre;
		this.edad = edad;
	}

	public static int DevuelveProximoID() {
		return cont +1;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return " id=" + id + ", nombre=" + nombre + ", edad=" + edad + " ";
	}


}
