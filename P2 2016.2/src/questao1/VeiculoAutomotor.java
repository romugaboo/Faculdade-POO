package questao1;

public abstract class VeiculoAutomotor implements Comparable<VeiculoAutomotor>{
	private String modelo;
	private Double gasMax;
	private Double gas;

	public VeiculoAutomotor(String modelo, double gasMax, double gas) {
		this.modelo = modelo;
		this.gasMax = gasMax;
		this.gas = gas;
	}

	public String getModelo() {
		return modelo;
	}

	public double getGasMax() {
		return gasMax;
	}

	public double getGas() {
		return gas;
	}
	
	public int compareTo(VeiculoAutomotor v) {
		return gas.compareTo(v.getGas());
	}
	
	public static double completarTanque(VeiculoAutomotor o) {
		BombaDeCombustivel b = new BombaDeCombustivel();
		if (o instanceof Motocicleta) {
			b.setQtdeCombustivelUtilizado(b.getQtdeCombustivelUtilizado() + 0.9 * o.gasMax - o.gas);
			return o.gas = 0.9 * (o.gasMax);
		}
		else {
			b.setQtdeCombustivelUtilizado(b.getQtdeCombustivelUtilizado() + o.gasMax - o.gas);
			return o.gas = o.gasMax;
		}
	}
}