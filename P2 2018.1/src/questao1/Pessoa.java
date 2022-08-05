package questao1;

import java.util.*;

public abstract class Pessoa implements Comparable<Pessoa>{
	private String cpf;
	private String nome;
	private int idade;

	public Pessoa(String cpf) {
		this.cpf = cpf;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade){
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public boolean existe(List<Pessoa> x, Pessoa y) {
		return x.contains(y);
	}

	public boolean equals(Object o) {
		if (o instanceof Pessoa) {
			Pessoa p = (Pessoa) o;
			if (cpf.equals(p.cpf) && nome.equals(p.nome))
				return true;
		}
		return false;
	}
	
	public int compareTo(Pessoa o) {
		return nome.compareTo(o.getNome());
	}
	
	public String toString() {
		return "CPF: " + cpf + " Nome: " + nome + " Idade: " + idade;
	}
}