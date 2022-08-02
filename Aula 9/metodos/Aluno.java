package metodos;

public class Aluno implements Comparable<Aluno> {

	private String nome;
	private double MediaFinal;
	
	public Aluno (String n, double m) {
		nome = n;
		MediaFinal = m;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMediaFinal() {
		return MediaFinal;
	}

	public void setMediaFinal(double mediaFinal) {
		MediaFinal = mediaFinal;
	}

	@Override
	public int compareTo(Aluno o) {
		return getNome().compareTo(o.getNome());
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", MediaFinal=" + MediaFinal + "]";
	}
	
	
	}
