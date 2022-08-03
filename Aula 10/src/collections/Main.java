package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList x = new ArrayList();
		x.add("Casa");
		x.add("Casa");
		x.add("Navio");
		
		// Collections.frequency = retorna frequ�ncia do elemento na cole��o
		// Usa o m�todo equals() para comparar os itens
		System.out.println(Collections.frequency(x, "Casa"));
		
		ArrayList y = new ArrayList();
		y.add("Bola");
		
		// Collections.copy = copia �ndices
		// O destino (x) deve ser pelo menos do tamanho do original (y)
		Collections.copy(x, y);
		System.out.println(x);
		System.out.println(y);
		
		// Collections.shuffle = embaralha os itens
		Collections.shuffle(x);
		System.out.println(x);
		Collections.shuffle(x);
		System.out.println(x);
	}
}
