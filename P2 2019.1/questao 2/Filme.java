package questao2;

public class Filme implements Comparable<Filme> {
	private String id;
	private String titulo;
	private int ano;
	
	/*public int hashCode() {
		return 1;
	}*/
	
	public int hashCode() {
		return titulo.hashCode();
	}
	
	public Filme (String id, String titulo, int ano) {
		this.id = id;
		this.titulo = titulo;
		this.ano = ano;
	}
	
	public String toString() {
		return "Filme [id=" + id + ", titulo=" + titulo + ", ano=" + ano + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int compareTo(Filme o) {
		return titulo.compareTo(o.titulo);
	}

	public boolean equals(Object o) {
		if (o instanceof Filme) {
			Filme f = (Filme) o;
			return titulo.equals(f.titulo);
		}
		return false;
	}
}