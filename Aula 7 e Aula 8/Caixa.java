import java.util.*;
public class Caixa {
	public static void main (String[] args) {
		Conta c = new Conta();
		c.depositar(100);
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual valor quer sacar?");
		double x = sc.nextDouble();
		sc.close();
		try {
			c.sacar(x);
			liberaDinheiro(x);
		}
		catch (SemSaldoException e) {
			System.out.println("Sem Dinheiro " + e.getMessage());
		}
		System.out.println("Fim");
	}
	public static void liberaDinheiro(double d) {
		System.out.println("Dinheiro liberado " + d);
	}
}