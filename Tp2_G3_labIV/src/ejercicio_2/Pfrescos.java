package ejercicio_2;

import java.util.Objects;

public class Pfrescos extends Producto{
	private String FechaDeenvasado;
	private String PaisDeOrigen;
	
	Pfrescos(){
		super();
		this.FechaDeenvasado = "00/00/0000";
		this.PaisDeOrigen = "xxxxxxx";
	}
	
	Pfrescos(String FechaDeCaducidad,int NumeroDeLote,String FechaDeEnvasado,String PaisDeOrigen){
	super(FechaDeCaducidad,NumeroDeLote);
	this.FechaDeenvasado = FechaDeEnvasado;
	this.PaisDeOrigen = PaisDeOrigen;	
	}

	public String getFechaDeenvasado() {
		return FechaDeenvasado;
	}

	public void setFechaDeenvasado(String fechaDeenvasado) {
		FechaDeenvasado = fechaDeenvasado;
	}

	public String getPaisDeOrigen() {
		return PaisDeOrigen;
	}

	public void setPaisDeOrigen(String paisDeOrigen) {
		PaisDeOrigen = paisDeOrigen;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(FechaDeenvasado, PaisDeOrigen);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pfrescos other = (Pfrescos) obj;
		return Objects.equals(FechaDeenvasado, other.FechaDeenvasado)
				&& Objects.equals(PaisDeOrigen, other.PaisDeOrigen);
	}

	@Override
	public String toString() {
		return super.toString() + "\nProducto tipo : Fresco \nFecha de envasado : " + FechaDeenvasado + "\nPais de origen : " + PaisDeOrigen;
	}
	
}
