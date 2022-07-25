package frequency;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		ArrayList x = new ArrayList();
		x.add("casa");
		x.add("casa");
		x.add("navio");
		System.out.println(Collections.frequency(x, "casa"));
		System.out.println(x);
		String [] y = new String[8];
		//Arrays.asList(x);
		Collections.shuffle(x);
		System.out.println(x);
	}
}