package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	public static void main(String[] args) {
		ArrayList x = new ArrayList();
		Aluno a1 = new Aluno("Maria", 8);
		Aluno a2 = new Aluno("Glaucia", 7);
		Aluno a3 = new Aluno("Fabiana", 6);
		
		x.add(a1);
		x.add(a2);
		x.add(a3);
		
		Collections.sort(x);
		
		System.out.println(x);
	}
	
}
