package questao1;

import java.util.*;

public class Utils2 {
	public static void imprimirCustos(List <Carro> lista) {
		Iterator it = lista.iterator();
		while (it.hasNext()) {
			Carro c = (Carro) it.next();
			List <Acessorio> lista2 = c.getLista();
			Iterator it2 = lista2.iterator();
				while (it2.hasNext()) {
					Acessorio a = (Acessorio) it2.next();
					System.out.println(a.getPreco());
					System.out.println(a.calcularImpostoRenda());
				}
		}
	}
	public static Map <String, Carro> transformaListaEmMapa (List<Carro> carros) {
		Map<String, Carro> m = new HashMap<String, Carro>();
		Iterator <Carro> it = carros.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			if (o instanceof Carro) {
				Carro c = (Carro) o;
				m.put(c.getPlaca(), c);
			}
		}
		return m;
	}
}