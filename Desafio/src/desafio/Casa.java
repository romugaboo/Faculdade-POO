package desafio;

public class Casa extends Imovel{
	private boolean temPiscina;
	
	public Casa(String nomeP, String endereco, boolean vendaOuAluguel, double valor, String id, boolean temPiscina) {
		super(nomeP, endereco, vendaOuAluguel, valor, id);
		this.temPiscina = temPiscina;
	}

	public boolean isTemPiscina() {
		return temPiscina;
	}
}
