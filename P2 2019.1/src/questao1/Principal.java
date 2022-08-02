package questao1;

import java.util.*;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o id");
		String id = sc.nextLine();
		Produto p = new Produto(id);
		List lista = new ArrayList();
		lista = Utils.getLista();
		if (Utils.existe(lista, p)) {
			int idx = lista.indexOf(p);
			System.out.println(lista.get(idx));
			Map<String, Produto> m = transformaListEmMap(lista);
			// System.out.println(m);
			Produto a[] = transformaMap(m);
			System.out.println(a.length);
		}
	}

	public static Map<String, Produto> transformaListEmMap(List k) {
		Map<String, Produto> m = new HashMap<String, Produto>();
		Iterator it = k.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			if (o instanceof Produto) {
				Produto p = (Produto) o;
				m.put(p.getId(), p);
			}
		}
		return m;
	}

	public static Produto[] transformaMap(Map<String, Produto> m) {
		Produto p[] = new Produto[m.size()];
		int c = 0;
		Iterator it = m.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			p[c] = m.get(key);
			c++;
		}
		return p;
	}
}