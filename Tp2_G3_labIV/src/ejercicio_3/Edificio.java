package ejercicio_3;

public abstract class Edificio {

	protected static double Superficie;
	
	Edificio(){
		this.Superficie = 0;
	}
	
	Edificio(double superficie){
		this.Superficie = superficie;
		}

	public double getSuperficie() {
		return Superficie;
	}

	public void setSuperficie(double superficie) {
		Superficie = superficie;
	}

	@Override
	public String toString() {
		return "Edificio [Superficie=" + Superficie + "]";
	}	
	
}
