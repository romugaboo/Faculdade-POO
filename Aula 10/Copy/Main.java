package copy;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		ArrayList x = new ArrayList();
		x.add("casa");
		x.add("casa");
		x.add("navio");
		ArrayList y = new ArrayList();
		y.add("bola");
		Collections.copy(x, y);
		System.out.println(x);
		System.out.println(y);
	}
}