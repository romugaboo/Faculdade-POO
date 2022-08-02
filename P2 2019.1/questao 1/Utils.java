package questao1;

import java.util.*;

public class Utils {
	public static boolean existe(List x, Produto y) {
		return x.contains(y);
	}

	public static List getLista() {
		ArrayList x = new ArrayList();
		x.add(1);
		x.add("casa");
		Produto p1 = new Produto("15");
		p1.setCor("Azul");
		x.add(p1);
		Produto p2 = new Produto("30");
		p2.setCor("Verde");
		x.add(p2);
		Produto p3 = new Produto("45");
		p3.setCor("Amarelo");
		x.add(p3);
		return x;
	}
}