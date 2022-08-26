package questao1;

public class VidroEletrico extends Acessorio{

	public VidroEletrico(String marca, int preco) {
		super(marca, preco);
	}

	public double calcularImpostoRenda() {
		return getPreco() * 0.2;
	}

}
