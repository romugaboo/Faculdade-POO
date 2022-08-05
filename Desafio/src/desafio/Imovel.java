package desafio;

public class Imovel {
	private String nomeP;
	private String endereco;
	private boolean vendaOuAluguel; //venda = true e aluguel = false;
	private double valor;
	private String id;
	
	public Imovel(String nomeP, String endereco, boolean vendaOuAluguel, double valor, String id) {
		this.nomeP = nomeP;
		this.endereco = endereco;
		this.vendaOuAluguel = vendaOuAluguel;
		this.valor = valor;
		this.id = id;
	}

	public String getNomeP() {
		return nomeP;
	}

	public String getEndereco() {
		return endereco;
	}

	public boolean isVendaOuAluguel() {
		return vendaOuAluguel;
	}

	public double getValor() {
		return valor;
	}

	public String getId() {
		return id;
	}
}