package ejercicio_3;

public class EdificioDeOficinas extends Edificio{

	private int NumeroOficinas;

	
	EdificioDeOficinas(){
		super();
		this.NumeroOficinas = 0;
	}
	
	EdificioDeOficinas(int oficinas, double superficie){
		super(superficie);
		this.NumeroOficinas = oficinas;
	}
	
	
	
	public int getNumeroOficinas() {
		return NumeroOficinas;
	}


	public void setNumeroOficinas(int numeroOficinas) {
		NumeroOficinas = numeroOficinas;
	}


	@Override
	public String toString() {
		return "\nEdificioDeOficinas [NumeroOficinas=" + NumeroOficinas +
				", Superficie del edificio: " + getSuperficie() ;
	}

}
