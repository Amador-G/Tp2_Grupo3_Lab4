package ejercicio_2;

public class Prefrigerados extends Producto{

	private int OrganismoSupervicionAlimentario;
	
	Prefrigerados (){
		super();
		this.OrganismoSupervicionAlimentario = 0000;
	}
	
	Prefrigerados(String FechaDeCaducidad,int NumeroDeLote, int OrganismoSupervicion){
		super(FechaDeCaducidad,NumeroDeLote);
		this.OrganismoSupervicionAlimentario = OrganismoSupervicion;
		
		}

	public int getOrganismoSupervicionAlimentario() {
		return OrganismoSupervicionAlimentario;
	}

	public void setOrganismoSupervicionAlimentario(int organismoSupervicionAlimentario) {
		OrganismoSupervicionAlimentario = organismoSupervicionAlimentario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + OrganismoSupervicionAlimentario;
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
		Prefrigerados other = (Prefrigerados) obj;
		if (OrganismoSupervicionAlimentario != other.OrganismoSupervicionAlimentario)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + "\nProducto de tipo: refrigerado \nCódigo del Organismo de Supervicion Alimentario: " + OrganismoSupervicionAlimentario;
	}
	
}
