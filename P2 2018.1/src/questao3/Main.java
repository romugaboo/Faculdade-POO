package questao3;

public class Main {
	public static void main(String[] args) {
		CarrinhoDeCompras c = new CarrinhoDeCompras();
		Livro b1 = new Livro("123");
		Livro b2 = new Livro("123");
		Livro b3 = new Livro("333");
		c.setLista(b1);
		c.setLista(b2);
		c.setLista(b3);
		Utils.livros(c);
	}
}