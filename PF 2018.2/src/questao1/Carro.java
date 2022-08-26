package questao1;

import java.util.*;

public class Carro {
	private String placa;
	private String cor;
	private int ano;
	private String renavan;

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getRenavan() {
		return renavan;
	}

	public void setRenavan(String renavan) {
		this.renavan = renavan;
	}
	
	public List <Acessorio> getLista() {
		return lista;
	}

	public void setLista(Acessorio ac) {
		lista.add(ac);
	}

	private List <Acessorio> lista = new ArrayList <Acessorio>();
}