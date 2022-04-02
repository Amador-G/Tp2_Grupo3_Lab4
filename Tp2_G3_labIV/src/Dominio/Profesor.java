package Dominio;

public class Profesor extends Empleado {
	private String Cargo;
	private int AntiguedadDocente;


	public Profesor() {
		super();
	}
	
	public Profesor(String nombre, int edad, String cargo, int antiguedadDocente) {
		super(nombre, edad);
		this.Cargo = cargo;
		this.AntiguedadDocente = antiguedadDocente;
	}

	public String getCargo() {
		return Cargo;
	}

	public void setCargo(String cargo) {
		Cargo = cargo;
	}

	public int getAntiguedadDocente() {
		return AntiguedadDocente;
	}

	public void setAntiguedadDocente(int antiguedadDocente) {
		AntiguedadDocente = antiguedadDocente;
	}

	@Override
	public String toString() {
		return "Profesor " + super.toString() +  "Cargo = " + Cargo + " Antiguedad Docente = " + AntiguedadDocente;
	}	

}
