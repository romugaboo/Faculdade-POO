package questao1;

public class Automovel extends VeiculoAutomotor{
	public Automovel (String modelo, double gasMax, double gas) {
		super (modelo, gasMax, gas);
	}
	
	public String toString () {
		return ("Autom�vel " + getModelo() + " com " + getGas() + " litros no tanque.");
	}
}
