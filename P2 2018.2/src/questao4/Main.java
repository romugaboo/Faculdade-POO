package questao4;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("A1", 5);
		m.put("A2", (int) 6.3);
		m.put("A3", 7);
		m.put("BD21", 3);
		m.put("B2", (int) 7.6);
		m.put("AC74", 2);
		m.put("A5", 8);
		m.put("B3", 3);
		System.out.println(contaA(m));
	}

	public static double contaA(Map mapa) {
		double d = 0;
		Iterator<String> it = mapa.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			if (key.startsWith("A"))
				d += (int) mapa.get(key);
		}
		return d;
	}
}