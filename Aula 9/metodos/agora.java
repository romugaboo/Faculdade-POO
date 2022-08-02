package metodos;

import java.util.ArrayList;
import java.util.Collections;

public class agora {
	public static void main(String [] args ) {
		ArrayList<String> x = new ArrayList<>();
		//Aluno a1 = new Aluno("Maria", 8);
		//Aluno a2 = new Aluno("Mario", 7);
		//Aluno a3 = new Aluno("Fabiana", 6);
		x.add("casa");
		x.add("casa");
		x.add("navio");
		//Collections.sort(x);
		//System.out.println(x);
		//System.out.println(Collections.frequency(x, "casa"));
		ArrayList<String> y = new ArrayList<>();
		y.add("bola");
		Collections.copy(x, y);
		System.out.println(x);
		System.out.println(y);
	}
}
