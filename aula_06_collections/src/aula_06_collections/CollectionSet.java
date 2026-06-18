package aula_06_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {
		
		
		Set<String> frutas = new HashSet<String>();
		ArrayList<String> listaFrutas = new ArrayList<String>(Arrays.asList("Banana", "Pêra"));
		
		frutas.add("Abacate");
		frutas.add("abacate");
		frutas.add("Morango");
		frutas.add("Maçã");
		frutas.add("Abacate");
		frutas.add("Laranja");
		frutas.addAll(listaFrutas);
		
		for (String fruta: frutas) {
			System.out.println(fruta);
			System.out.println(fruta.hashCode());
		}
		
		//Buscar elementos True/False
		System.out.println("A fruta laranja está presente? " + frutas.contains("laranja"));
		
		//Remover objeto 
		frutas.remove("Laranja");
		for (String fruta: frutas) {
			System.out.println(fruta);
		}
		
		

	}

}
