package teste;

import java.util.ArrayList;
public class TesteNNN {
	public static void main(String[] args) {
		ArrayList x = new ArrayList();
		String str = "carro antigo";
		x.add("casa nova");
		x.add(str);
		x.add(new ArrayList());
		str = "bola azul";
		System.out.println(x.get(1));
		teste(x);  
	}
	public static void teste(ArrayList y) {
		for (int i = 0; i < y.size(); i++) {
			System.out.println(((String)y.get(i)).split(" ").length);
		}

	}
}