package ejercicio_3;

public class Polideportivo extends Edificio implements IInstalacionDeportiva{

	private String NombrePolideportivo;

	
	Polideportivo (){
		super();
		this.NombrePolideportivo = "Sin nombre";
	}
	
	Polideportivo (String nombre, double superficie){
		super(superficie);
		this.NombrePolideportivo = nombre;
	}
	
	public String getNombrePolideportivo() {
		return NombrePolideportivo;
	}

	public void setNombrePolideportivo(String nombrePolideportivo) {
		NombrePolideportivo = nombrePolideportivo;
	}

	@Override
	public String toString() {
		return "Polideportivo [NombrePolideportivo=" + NombrePolideportivo + 
				", Superficie del edificio: " + getSuperficie() + 
				", Tipo de edificio: " + getTipoDeInstalacion() + "]" + "\n ";
	}

	
	@Override
	public int getTipoDeInstalacion() {
		return 1;
	}

	
	
}
