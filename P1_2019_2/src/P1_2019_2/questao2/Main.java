package questao2;

import java.util.*;

public class Main {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva um nome: ");
		String z = sc.nextLine();
		sc.close();
		getFunc(z);
	}
}