package atividades_pratica;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome; 
		int idade;
		
		
		System.out.println("Digite seu Nome completo: ");
		nome = leia.nextLine();
		
		System.out.println("Digite sua Idade: ");
		idade = leia.nextInt();
		
		if (idade >= 18) {
			
			System.out.println("Acesso liberado para: " + nome);
		} else {
			
		    System.out.println("Número da permissão: ");
			
			int codigoCorreto = 1234;
			
			int codigoDigitado = leia.nextInt();
			
			if (codigoDigitado == codigoCorreto) {
				System.out.println("Acesso liberado! ");
			}else {
				System.out.println("Acesso Negado !");
			}
		}
		
		
		
		
		leia.close();

	}

}
