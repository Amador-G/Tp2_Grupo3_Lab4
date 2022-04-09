package ejercicio_2;

import java.util.Objects;

public abstract class Producto {
	private String FechaDeCaducidad;
	private int NumeroDeLote;
	
	Producto(){
		FechaDeCaducidad = "00/00/0000";
		NumeroDeLote = 0000;
	}
	
	Producto(String FechaDeCaducidad, int NumeroDeLote){
		this.FechaDeCaducidad = FechaDeCaducidad;
		this.NumeroDeLote = NumeroDeLote;
	}

	public String getFechaDeCaducidad() {
		return FechaDeCaducidad;
	}

	public void setFechaDeCaducidad(String fechaDeCaducidad) {
		FechaDeCaducidad = fechaDeCaducidad;
	}

	public int getNumeroDeLote() {
		return NumeroDeLote;
	}

	public void setNumeroDeLote(int numeroDeLote) {
		NumeroDeLote = numeroDeLote;
	}

	@Override
	public int hashCode() {
		return Objects.hash(FechaDeCaducidad, NumeroDeLote);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(FechaDeCaducidad, other.FechaDeCaducidad) && NumeroDeLote == other.NumeroDeLote;
	}

	@Override
	public String toString() {
		return "\nProducto \n" + "N° de lote : " + NumeroDeLote + "\nFecha de caducidad : " + FechaDeCaducidad;
	}
	
	

}
