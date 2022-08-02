package questao2;

import java.util.*;

public class Utils3 {
	public static List processa(String [] filmes) {
		List x = new ArrayList();
		for (int i = 0; i < filmes.length; i++) {
			String fil = filmes[i];
			System.out.println(fil);
			String film [] = fil.split("#");
			
			Filme f = new Filme(film[0], film[1], Integer.parseInt(film[2]));
			x.add(f);
		}
		return x;
	}
}