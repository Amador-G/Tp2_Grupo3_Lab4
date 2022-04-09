package ejercicio_2;

import java.util.Objects;

public class Pcongelados extends Producto{
	private int CongelacionRecomendada;
	
	
	Pcongelados(){
		super();
		this.CongelacionRecomendada = 000;
	}
	Pcongelados(String FechaDeCaducidad,int NumeroDeLote,int CongelacionRecomendada ){
		super(FechaDeCaducidad, NumeroDeLote);
		this.CongelacionRecomendada = CongelacionRecomendada;
	}
	public int getCongelacionRecomendada() {
		return CongelacionRecomendada;
	}
	public void setCongelacionRecomendada(int congelacionRecomendada) {
		CongelacionRecomendada = congelacionRecomendada;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(CongelacionRecomendada);
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
		Pcongelados other = (Pcongelados) obj;
		return CongelacionRecomendada == other.CongelacionRecomendada;
	}
	@Override
	public String toString() {
		return super.toString() + "\nProducto tipo : Congelado \nCongelacionRecomendada : -" + CongelacionRecomendada + "g°";
	}
	
}
