package desafio;

public class Apto extends Imovel{
	private int andar;
	private int num;
	
	public Apto(String nomeP, String endereco, boolean vendaOuAluguel, double valor, String id, int andar, int num) {
		super(nomeP, endereco, vendaOuAluguel, valor, id);
		this.andar = andar;
		this.num = num;
	}

	public int getAndar() {
		return andar;
	}

	public int getNum() {
		return num;
	}
}