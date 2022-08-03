package questao1;

import java.util.*;

public class Utils {
	public static boolean existe (List<Aluno> x, Aluno y) {
		return x.contains(y);
	}
	
	public static void ordena (List<Aluno> x) {
		Collections.sort(x);
		System.out.println(x);
	}
	
	Map <String, Aluno> m = new HashMap <String, Aluno>();
	m.put("154-3#Simba Silva#3.7#R");
	
	public Map<String, Aluno> retornaDados(Set conjuntoAlunos){
		
	}
}