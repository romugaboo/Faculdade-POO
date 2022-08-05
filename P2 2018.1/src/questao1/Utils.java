package questao1;

import java.util.*;

public class Utils{
	public static void ordena (List<Pessoa> x) {
		Collections.sort(x);
		System.out.println(x);
	}
	
	public Map<String, Pessoa> retornaDados(Set conjuntoPessoas) throws FormatoIncorretoException{
		Map <String, Pessoa> m = new HashMap <String, Pessoa>();
		Iterator it = conjuntoPessoas.iterator();
		while (it.hasNext()) {
			String o = (String) it.next();
			String[] str = o.split("#");
			
			if (str.length != 4)
				throw new FormatoIncorretoException("O formato da String " + str + " está incorreto.");
				
			if (str[3].equals("PF")) {
				PessoaFisica pf = new PessoaFisica(str[0]);
				pf.setNome(str[1]);
				pf.setIdade(Integer.parseInt(str[2]));
				m.put(str[0], pf);
			}
			
			else if (str[3].equals("PJ")) {
				PessoaJuridica pj = new PessoaJuridica(str[0]);
				pj.setNome(str[1]);
				pj.setIdade(Integer.parseInt(str[2]));
				m.put(str[0], pj);
			}
			
			else
				throw new FormatoIncorretoException("O formato da String " + str + " está incorreto.");
		}		
		return m;
	}
}