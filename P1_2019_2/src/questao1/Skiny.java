package questao1;

public class Skiny extends Biscoito implements Comestivel {

	public Skiny(String id) {
		super(id);
	}
	public void comer () {
		System.out.println("Comendo Skiny");
	}
}