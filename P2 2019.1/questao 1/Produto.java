package questao1;

public class Produto {
	private String id;
	private String cor;
	private double preco;

	public Produto(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean equals(Object o) {
		if (o instanceof Produto) {
			Produto p = (Produto) o;
			if (id.equals(p.id))
				return true;
		}
		return false;
	}

	public String toString() {
		return "Produto [id=" + id + ", cor=" + cor + ", preco=" + preco + "]";
	}
}