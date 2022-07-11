package questao1;
import java.util.*;
public class Main {
	public static void main (String args[]) {
		List <Object> lista = new ArrayList <Object>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva o id de um biscoito: ");
		String z = sc.nextLine();
		sc.close();
		
		Biscoito Oreo = new Biscoito("100");
		Biscoito PiraqueDeLimao = new Biscoito ("200");
		lista.add(Oreo);
		Oreo.setPreco(4);
		lista.add(PiraqueDeLimao);
		PiraqueDeLimao.setPreco(6);
		
		System.out.println(Utils.existe(lista, Oreo));
		transformaListEmArray(lista);
		somaDosPrecos(lista);
		
		/*Utils.existe(lista, z);
		if (existe (lista, z)== true) {
			System.out.println("id: " + z.getId() + " cor: " + z.getCor() + " Preço: " + z.getPreco ());
		}
		*/
	}
	
	public static List <Object> transformaListEmArray(List x) {
		List <Object> lista2 = new ArrayList <Object>();
		for (int i = 0; i < x.size(); i++) {
			if (x.get(i) instanceof Biscoito) {
				lista2.add(x.get(i));
			}
		}
		return lista2;
	}
	
	public static void somaDosPrecos(List x) {
		int preco = 0;
		for (int i = 0; i < x.size(); i++) {
			if (x.get(i) instanceof Biscoito) {
				 preco = preco + ((Biscoito) x.get(i)).getPreco();
			}
		}
		System.out.println(preco);
	}
}