package questao1;

public final class Motocicleta extends VeiculoAutomotor{
	public Motocicleta (String modelo, double gasMax, double gas) {
		super (modelo, gasMax, gas);
	}
	
	public String toString () {
		return ("Motocicleta " + getModelo() + " com " + getGas() + " litros no tanque.");
	}
}
