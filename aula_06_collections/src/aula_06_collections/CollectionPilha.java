package aula_06_collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class CollectionPilha {

	public static void main(String[] args) {
		
		Deque<String> pilha = new ArrayDeque<String>();
		
		pilha.push("Azul");
		pilha.push("Verde");
		pilha.push("Amarelo");
		pilha.push("Branco");
		pilha.push("Laranja");
		
		//Remover Elementos da pilha 
		pilha.pop();
		
		//Verificar se o elemento esta na pilha
		System.out.println("A cor azul ainda esta na pilha? " + pilha.contains("azul"));
		
		for(var cor: pilha) {
			System.out.println(cor);
		}

	}

}
