package aula_03_condicionais;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero  = leia.nextInt();
		
		
		if (numero % 2 == 0 && numero > 0) {
			System.out.println("O Número" + numero + " é par e positivo ");
		}
		else if (numero % 2 == 0 && numero < 0) {
			System.out.println("O Número" + numero + " é par e negativo ");
		}
		else if (numero % 2 != 0 && numero > 0) {
			
		}
		else {
			System.out.println("O Número" + numero + " é impar e negativo ");
		}
		
		
		leia.close();

	}

}
