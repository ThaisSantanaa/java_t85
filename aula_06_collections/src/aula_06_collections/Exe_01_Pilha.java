package aula_06_collections;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Exe_01_Pilha {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Deque<String> pilha = new ArrayDeque<String>();
		
		int opcao = 0;
		
		do {
		
			System.out.println("|=======================================|");
			System.out.println("|=======================================|");
			System.out.println("|         Olá seja Bem Vindo(a)         |");
			System.out.println("|=======================================|");
			System.out.println("|      1 - Adicione um livro:           |");
			System.out.println("|---------------------------------------|");
			System.out.println("|      2 - Mostre todos os livros:      |");
			System.out.println("|---------------------------------------|");
			System.out.println("|      3 - Retirar um livro da lista    |");
			System.out.println("|---------------------------------------|");
			System.out.println("|      0 - Sair                         |");
			System.out.println("|=======================================|");
			
			 opcao = leia.nextInt();

			switch(opcao) {
			 case 1:
				    leia.nextLine();
		        	System.out.println("O nome do livro: ");
		        	 String nomeLivro = leia.nextLine();
		        	 pilha.push(nomeLivro);
		        	 break;
		        
			 case 2:
				    if (pilha.isEmpty()) {
				        System.out.println("Sem livros!");
				    } else {
				        System.out.println("Livros disponiveis: " + pilha);
				    }
				    break;
		     
		     case 3:
				    pilha.remove();
		        	System.out.println("Retirar um livro da lista: ");
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
		
		
		
		
		
		
		
	
