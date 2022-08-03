package questao1;

import java.util.*;

public class Main {
	public static void main(String[] args) throws RuntimeException{
		Set <String> s = new HashSet <String>();
		s.add("154-3#Simba Silva#3.7#R");
		s.add("553-2#Juju Juba#10.0#E");
		Utils u = new Utils();
		System.out.println(u.retornaDados(s));
	}
}