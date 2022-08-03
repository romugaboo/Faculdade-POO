package generics;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<String> x = new ArrayList<String>();
		x.add("Casa");
		x.add("Casa");
		x.add("Navio");
		
		// Ao usar a tipagem do Java, especificando que o Iterator retorna strings,
		// não precisamos mais fazer o cast de Object para String.
		Iterator<String> it = x.iterator();
		while(it.hasNext()) {
			String str = it.next(); 
			System.out.println(str);
		}
	}

}
