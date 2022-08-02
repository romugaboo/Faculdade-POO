package questao2;

import java.util.*;

public class Principal {
	public static void main(String[] args) {
		Set u = new HashSet();
		List x = Utils3.processa(LocAntiga.getFilmes());
		Collections.sort(x);
		u.addAll(x);
		/*for (int i = 0; i < x.size(); i++) {
			u.add(x.get(i));
		}*/	
		Iterator it = u.iterator();
		while (it.hasNext()) {
			Filme f = (Filme) it.next();
			System.out.println(f.getTitulo() + " " + Collections.frequency(x, f));
		}
	}
}