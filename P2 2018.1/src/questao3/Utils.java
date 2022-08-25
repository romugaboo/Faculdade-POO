package questao3;

import java.util.*;

public class Utils {
	public static void livros(CarrinhoDeCompras c) {
		Set s = new HashSet();
		s.addAll(c.getLista());
		Iterator i = s.iterator();
		while (i.hasNext()) {
			Livro x = (Livro) i.next();
			System.out.println((x.getId() + " - " +  Collections.frequency(c.getLista(), x)));
		}
	}
		
	/*	
	public static void livros(CarrinhoDeCompras c) {
		Iterator i = c.getLista().iterator();
		while (i.hasNext()) {
			Livro x = (Livro) i.next();
			System.out.println((x.getId() + " - " +  Collections.frequency(c.getLista(), x)));
		}
	}
	*/
}