package aula_06_collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exe_01_Queue {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Queue<String> fila = new LinkedList<>();
		
		int opcao = 0;
		
		do {
		
			System.out.println("|=======================================|");
			System.out.println("|=======================================|");
			System.out.println("|         Olá seja Bem Vindo(a)         |");
			System.out.println("|=======================================|");
			System.out.println("|      1 - Digite o nome do cliente:    |");
			System.out.println("|---------------------------------------|");
			System.out.println("|      2 - Todos os clientes da lista   |");
			System.out.println("|---------------------------------------|");
			System.out.println("|      3 - Retirar clientes da lista    |");
			System.out.println("|---------------------------------------|");
			System.out.println("|      0 - Sair                         |");
			System.out.println("|=======================================|");
			
			 opcao = leia.nextInt();

			switch(opcao) {
			 case 1:
		        	System.out.println("O nome do cliente é: ");
		        	 String nomeCliente = leia.next();
		        	    fila.add(nomeCliente);
		        	    break;
		        
			 case 2:
				    if (fila.isEmpty()) {
				        System.out.println("Fila vazia!");
				    } else {
				        System.out.println("Clientes na fila: " + fila);
				    }
				    break;
		     
		     case 3:
				    fila.remove();
		        	System.out.println("Retirar o cliente da lista: ");
		     break;
		     
			 case 0:
		        	System.out.print("\nVocê saiu do programa.");
		     break;
		     
			 default:
		        	System.out.println("Opção Invalida!");
			}
			
		} while (opcao != 0);
	   
	leia.close();
			
			}
}
		


