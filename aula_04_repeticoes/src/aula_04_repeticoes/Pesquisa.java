package aula_04_repeticoes;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, esporte, somaIdades =0, totalRespostas = 0, futebol = 0, voleiM18 = 0;
		double mediaIdades = 0.0;
		char continua = 'S';
		
		while (continua == 'S') {
			
			System.out.println("************************************");
			System.out.println("**PESQUISA SOBRE ESPORTES FAVORITOS**");
			System.out.println("************************************");
			
			System.out.print("Digite a sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("Escolha o seu esporte favorito: ");
			System.out.println(" 1- Futebol");
			System.out.println(" 2- Volei");
			System.out.println(" 3- Basquete");
			System.out.println(" 4- Outros");
			
		    esporte = leia.nextInt();
		    
		    /* Estatísticas */
		    
		    //Total de pessoas que responderam a pesquisa
		    totalRespostas ++; 
		    
		    
		    //Total das idades de todas as pessoas que responderam a pesquisa
		    somaIdades += idade;
		    
		    //Total de pessoas que gostam de futebol
		    if (esporte == 1)
		    	futebol ++;
		    
		    //Total de pessoas que gostam de volei e são maiores de 18
		    if (idade > 18 && esporte == 2)
		    	voleiM18 ++;
		    
		    do {
		    System.out.println("Deseja continuar? (S/N)");
		    continua = leia.next().toUpperCase().charAt(0);
		    }while (!(continua == 'S') && ! (continua == 'N'));
			
			
		}
		
		mediaIdades = somaIdades / totalRespostas;
		System.out.printf("Total de pessoas que gostam de futebol: %d\n", futebol);
		System.out.printf("Toral de pessoas maiores de 18 anos e que gostam de volei: %d\n", voleiM18);
		System.out.printf("Média das idades: %.2f\n", mediaIdades);
		leia.close();

	}

}
