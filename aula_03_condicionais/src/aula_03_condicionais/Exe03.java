package aula_03_condicionais;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		
		System.out.println("Digite seu Nome completo: ");
		nome = leia.nextLine();
		
		System.out.println("Digite sua Idade: ");
		idade = leia.nextInt();
		
		if (idade >= 18 && idade <= 60) {
		System.out.println( nome + " está apto(a) para Doar Sangue! ");
		
		 } else if (idade >= 60 && idade <= 69) {
	         System.out.print("É a primeira vez doando? ");
	         String resposta = leia.nextLine();


	}

			leia.close();
		
}
	
}