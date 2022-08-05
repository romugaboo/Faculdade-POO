package questao1;

public class Main {
	public static void main(String[] args) throws FormatoIncorretoException {
		BancoDeDados b = new BancoDeDados();
		Utils u = new Utils();
		System.out.println(u.retornaDados(b.getPessoas()));
	}
}