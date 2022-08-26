package questao1;

import java.util.*;

public class Principal {
	public static void main(String[] args) {
		List<Carro> lista = new ArrayList<Carro>();
		
		Carro c1 = new Carro();
		Carro c2 = new Carro();
		Som s1 = new Som("abc", 200);
		Som s2 = new Som("def", 500);
		VidroEletrico v1 = new VidroEletrico("aaa", 300);
		VidroEletrico v2 = new VidroEletrico("bbb", 400);
		
		c1.setLista(s1);
		c2.setLista(s2);
		c1.setLista(v1);
		c2.setLista(v2);
		
		lista.add(c1);
		lista.add(c2);
		
		Utils2.imprimirCustos(lista);
		
		System.out.println(Utils2.transformaListaEmMapa (lista));
	}
}
