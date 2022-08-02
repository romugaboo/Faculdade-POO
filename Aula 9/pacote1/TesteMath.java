package pacote1;
import org.apache.commons.math3.ml.distance.EuclideanDistance;

public class TesteMath {
	public static void main(String[] args) {
		EuclideanDistance dist = new EuclideanDistance();
		
		double a[] = {1.0, 1.0, 2.0, 2.2};
		double b[] = {1.0, 1.0, 2.0, 2.1};
		
		double distancia = dist.compute(a,  b);
		System.out.println(distancia);
	}
}
