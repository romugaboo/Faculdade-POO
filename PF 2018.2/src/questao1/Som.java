package questao1;

public class Som extends Acessorio {

	public Som(String marca, int preco) {
		super(marca, preco);
	}

	public double calcularImpostoRenda() {
		return getPreco() * 0.3;
	}

}
