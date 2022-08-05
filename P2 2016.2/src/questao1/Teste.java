package questao1;

import java.util.*;

public class Teste {
	public static void main(String[] args) {
		BombaDeCombustivel bomba = new BombaDeCombustivel();
		List <VeiculoAutomotor> veiculos = new ArrayList();
		
		veiculos.add(new Motocicleta("XTR 125", 20, 5));
		veiculos.add(new Automovel("Palio 1.6", 50, 32));
		veiculos.add(new Motocicleta("CB 400", 25, 15));
	
		System.out.println("Ve�culos N�O ORDENADOS");
		System.out.println(veiculos);
		System.out.println();
		
		bomba.abastecerVeiculos(veiculos);
		
		Collections.sort(veiculos);
		
		System.out.println("Veiculos ORDENADOS pela quantidade de combust�vel no tanque");
		System.out.println(veiculos);
		System.out.println();
		
		System.out.println("Total de combust�vel utilizado: " + bomba.getQtdeCombustivelUtilizado());
	}
}
