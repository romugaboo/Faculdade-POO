package pacote1;
import java.io.*;
/** Esta classe representa um aparelho de telefone */
public class Telefone implements Serializable {
	private static final long serialVersionUID = 1L;
	private int ano;
	/** Método para atribuir o ano */
	public void setAno (int ano) {
		this.ano = ano;
	}
	public String toString() {
		return String.valueOf(ano);
	}
}