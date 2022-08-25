package desafio;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Map<String, Imovel> m  = new HashMap<String, Imovel>();
		
		Casa c1 = new Casa("Jão", "okefowfjk", true, 200000, "123", true);
		m.put(c1.getId(), c1);
		Casa c2 = new Casa("Almir", "aaaa", false, 700, "456", false);
		m.put(c2.getId(), c2);
		Casa c3 = new Casa("Belle Belinha", "ieieie", true, 125000, "789", false);
		m.put(c3.getId(), c3);
		
		Apto a1 = new Apto("Bluezao", "iiiii", false, 5000, "1234", 3, 20);
		m.put(a1.getId(), a1);
		Apto a2 = new Apto("Alanzoka", "sisi", true, 350000, "5678", 11, 15);
		m.put(a2.getId(), a2);
		Apto a3 = new Apto("Lari", "heaven", false, 1500, "9", 9, 2);
		m.put(a3.getId(), a3);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o id");
		String i = sc.nextLine();
		System.out.println(m.get(i));
		
		System.out.println(calcularSoma(m));
		System.out.println(calcularMedia(m));
	}
	
	public static double calcularSoma(Map<String, Imovel> m) {
		double d = 0;
		Iterator it = m.values().iterator();
		while(it.hasNext()) {
			Imovel i = (Imovel) it.next();
			if (i.isVendaOuAluguel())
				d = d + (i.getValor());
		}
		return d;
	}
	
	public static double calcularMedia(Map<String, Imovel> m) {
		double d = 0;
		int c = 0;
		Iterator it = m.values().iterator();
		while(it.hasNext()) {
			Imovel i = (Imovel) it.next();
			if (!i.isVendaOuAluguel()) {
				d = d + i.getValor();
				c++;
			}
		}
		return d/c;
	}
}
