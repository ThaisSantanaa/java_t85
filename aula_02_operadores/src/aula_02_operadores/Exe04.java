package aula_02_operadores;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o numero1: ");
		float valornumero1 = leia.nextFloat();
		
		System.out.println("Digite o numero2: ");
		float valornumero2 = leia.nextFloat();
		
	    System.out.println("Digite o numero3: ");
		float valornumero3 = leia.nextFloat();
		
		System.out.println("Digite o numero4: ");
		float valornumero4 = leia.nextFloat();
		
		float diferenca = (valornumero1 * valornumero2) - (valornumero3 * valornumero4);
		
		System.out.printf("\ndiferenca = %.2f", diferenca);
		
		leia.close();
		
		

	}

}
