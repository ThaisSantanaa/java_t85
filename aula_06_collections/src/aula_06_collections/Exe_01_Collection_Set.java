package aula_06_collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exe_01_Collection_Set {

	public static void main(String[] args) {
		
		Set<String> setNumeros = new HashSet<String>();
		
		Scanner leia = new Scanner(System.in);
		
		 //Usuario digita o número
		for (int i = 0; i < 10; i ++) {
			 System.out.print("\nDigite um numero: ");
			 setNumeros.add(leia.next());
		}
		
		 //Números digitados pelo usuario
		 System.out.println("\nResultado: " + setNumeros);
		 
		 //Infomativo de que números repetidos não vão aparecer
		 System.out.println("\n******Não aceita números repetidos!*******");
		 
	
		leia.close();

	}

}
