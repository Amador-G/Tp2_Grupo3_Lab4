package Dominio;

public class Profesor extends Empleado implements Comparable<Profesor>{


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
	
	@Override
	public int compareTo(Profesor o) {
		if(o.getId() == this.getId())
		return 0;
		if(o.getId()>this.getId()){
			return -1;
		}
		return 1;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + AntiguedadDocente;
		result = prime * result + ((Cargo == null) ? 0 : Cargo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		if (AntiguedadDocente != other.AntiguedadDocente)
			return false;
		if (Cargo == null) {
			if (other.Cargo != null)
				return false;
		} else if (!Cargo.equals(other.Cargo))
			return false;
		return true;
	}
}
