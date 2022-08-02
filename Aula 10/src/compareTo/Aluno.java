package compareTo;

public class Aluno implements Comparable<Aluno> {
	private String nome;
	private double mediaFinal;

	public Aluno(String nome, double mediaFinal) {
		this.nome = nome;
		this.mediaFinal = mediaFinal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMediaFinal() {
		return mediaFinal;
	}

	public void setMediaFinal(double mediaFinal) {
		this.mediaFinal = mediaFinal;
	}
	
	public String toString() {
		return nome + " " + mediaFinal;
	}

	public int compareTo(Aluno x) {
		return getNome().compareTo(x.getNome());
		//return new Double (getMediaFinal()).compareTo(getMediaFinal());
		//return Double.compare(getMediaFinal(), x.getMediaFinal());
	}
}