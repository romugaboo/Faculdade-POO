package pacote1;
import java.io.*;
import java.util.*;
public class Serialização {
	
	public static final String CAMINHO_ARQUIVO = "C:\\Users\\aluno\\Documents\\lari\\teste.ser";
	
	public static void main (String [] args) throws Exception {
		Object obj = carregarObjeto (CAMINHO_ARQUIVO);
		ArrayList lista = (ArrayList) obj;
		if (obj != null) {
			System.out.println(obj);
		}
		System.exit(0);
		Scanner sc = new Scanner(System.in);
		ArrayList x = new ArrayList();
		Telefone tel = new Telefone();
		System.out.println("Insira um número e um telefone:");
		int num = sc.nextInt();
		while (num != -1) {
			x.add(tel);
			System.out.println("Insira um número e um telefone:");
			num = sc.nextInt();
		}
		persistirObjeto(x, CAMINHO_ARQUIVO);
	}
	
	public static void persistirObjeto (Object obj, String caminho) throws IOException{
		ObjectOutputStream objGravar = new ObjectOutputStream (new FileOutputStream(caminho));
		objGravar.writeObject(obj);
		objGravar.close();
	}
	
	public static Object carregarObjeto (String nomeArquivo) throws Exception {
		ObjectInputStream objLeitura = new ObjectInputStream(new FileInputStream(nomeArquivo));
		Object obj = objLeitura.readObject();
		objLeitura.close();
		return obj;
	}
}