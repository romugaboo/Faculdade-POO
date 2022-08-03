package questao1;

import java.util.*;

public class Utils extends RuntimeException{
	public static boolean existe (List<Aluno> x, Aluno y) {
		return x.contains(y);
	}
	
	public static void ordena (List<Aluno> x) {
		Collections.sort(x);
		System.out.println(x);
	}
	
	public Map<String, Aluno> retornaDados(Set conjuntoAlunos){
		Map <String, Aluno> m = new HashMap <String, Aluno>();
		Iterator it = conjuntoAlunos.iterator();
		while (it.hasNext()) {
			String o = (String) it.next();
			String[] str = o.split("#");
			
			if (str.length != 4)
				throw new RuntimeException();
				
			if (str[3].equals("R")) {
				AlunoRegular ar = new AlunoRegular(str[0]);
				ar.setNome(str[1]);
				ar.setNota(Double.parseDouble(str[2]));
				m.put(str[0], ar);

			}
			
			else if (str[3].equals("E")) {
				AlunoEspecial ae = new AlunoEspecial(str[0]);
				ae.setNome(str[1]);
				ae.setNota(Double.parseDouble(str[2]));
				m.put(str[0], ae);

			}
			
			else
				throw new RuntimeException();
		}		
		return m;
	}
}