package questao1;

public abstract class Acessorio {
	private String marca;
	private int preco;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public Acessorio(String marca, int preco) {
		this.marca = marca;
		this.preco = preco;
	}

	public abstract double calcularImpostoRenda();
}
