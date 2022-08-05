package questao3;

public class Livro {
	private String id;
	
	public int hashCode() {
		return id.hashCode()
;	}
	
	public Livro (String id) {
		this.id = id;
	}
	
	public boolean equals (Object o) {
		if (o instanceof Livro) {
			Livro liv = (Livro) o;
			if (id.equals(liv.id)) {
				return true;
			}
		}
		return false;
	}
	
	public String getId() {
		return id;
	}
}
