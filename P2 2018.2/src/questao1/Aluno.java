package questao1;

public class Aluno implements Comparable<Aluno> {
	private String id;
	private String nome;
	private double nota;

	public Aluno(String id) {
		this.id = id;
	}

	public String toString() {
		return "id = " + id + " nome = " + nome + " nota = " + nota;
	}

	public String getNome() {
		return nome;
	}

	public boolean equals(Object o) {
		if (o instanceof Aluno) {
			Aluno a = (Aluno) o;
			if (id.equals(a.id))
				return true;
		}
		return false;
	}

	public int compareTo(Aluno o) {
		return getNome().compareTo(o.getNome());
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
}