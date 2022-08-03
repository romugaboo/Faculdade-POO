package comparable;

public class Aluno implements Comparable<Aluno> {

	private String nome;
	private double mediaFinal;
	
	public Aluno(String n, double m) {
		nome = n;
		mediaFinal = m;
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
	
	public int compareTo(Aluno x) {
		return getNome().compareTo(x.getNome());
		// ou
		// return (new Double(getMediaFinal()).compareTo(x.getMediaFinal()));
		// ou
		// return Double.compare(getMediaFinal(), x.getMediaFinal());
	}
}
