package aula_02_operadores;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digita Nota portugues: ");
		float valorNotaPortugues = leia.nextFloat();
		

		System.out.println("Digita Nota matematica: ");
		float valorNotaMatematica = leia.nextFloat();
		
		System.out.println("Digita Nota Artes: ");
		float valorNotaArtes = leia.nextFloat();
		
		System.out.println("Digita Nota Geografia: ");
		float valorNotaGeografia = leia.nextFloat();
		
		float media = valorNotaPortugues + valorNotaMatematica + valorNotaArtes + valorNotaGeografia;

		System.out.printf("\nNota final: %.2f", media /4 );

		
		leia.close();
		
		
		
	}

}
