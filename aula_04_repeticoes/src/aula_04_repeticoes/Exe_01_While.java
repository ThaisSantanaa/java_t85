package aula_04_repeticoes;

import java.util.Scanner;

public class Exe_01_While {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, genero,  opcao = 0,somaIdade = 0, pessoaDev = 0, totalRespostas = 0, mulherFrontend = 0, frontend = 0, homensCis = 0, homensMobile40 = 0, backend = 0;
		double mediaIdades = 0.0;
		char continua = 'S';
		
		while (continua == 'S') {
		
		System.out.println("************************************");
		System.out.println("*****PESQUISA COLABORADORES DEV*****");
		System.out.println("************************************");
		
		System.out.print("Digite a sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Com qual genero você se identifica? ");
		System.out.println(" 1- Mulher Cis");
		System.out.println(" 2- Homem Cis");
		System.out.println(" 3- Não Binário");
		System.out.println(" 4- Mulher Trans");
		System.out.println(" 5- Homem Trans");
		System.out.println(" 6- Outros");
		
		genero = leia.nextInt();
		
		System.out.println("Pessoa Desenvolvedora: ");
		System.out.println(" 1- Backend");
		System.out.println(" 2- Frontend");
		System.out.println(" 3- Mobile");
		System.out.println(" 4- FullStack");
		
		pessoaDev = leia.nextInt();
		
	    totalRespostas++;
	    somaIdade += idade;

	    if (pessoaDev == 1) {
	        backend++;
	    }

	    if ((genero == 1 || genero == 4) && pessoaDev == 2) {
	        mulherFrontend++;
	    }

	    if ((genero == 2 || genero == 4) && pessoaDev == 3 && idade > 40) {
	        homensMobile40++;
	    }
	    
	    do {
		    System.out.println("Deseja continuar? (S/N)");
		    continua = leia.next().toUpperCase().charAt(0);
		    }while (!(continua == 'S') && ! (continua == 'N'));
		}

		    
		    System.out.println("pessoas desenvolvedoras backend: " + backend);
	        System.out.println("Mulheres Cis e Trans desenvolvedoras frontend: " + mulherFrontend);
	        System.out.println("Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + homensMobile40);
	        System.out.println("Total respostas: " + totalRespostas);
	        System.out.println("Média idade das pessoas que responderam à pesquisa: " + (somaIdade / (double) totalRespostas));

		
		leia.close();

	}

	}

