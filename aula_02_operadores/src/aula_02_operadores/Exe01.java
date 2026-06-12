package aula_02_operadores;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("DIGITE O SEU SALÁRIO: ");
		float valorSalario = leia.nextFloat();
		
		System.out.println("DIGITE ABONO: ");
		float valorAbono = leia.nextFloat();
		
		System.out.printf("\nNovo Salario = %.2f = %.2f + %.2f", valorSalario, valorAbono, (valorSalario + valorAbono));
		
		
		leia.close();

	}

}
