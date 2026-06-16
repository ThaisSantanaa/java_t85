package aula_03_condicionais;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite o valor a: ");
		a = leia.nextInt();
		
		System.out.println("Digite o valor b: ");
		b = leia.nextInt();
		
		System.out.println("Digite o valor c: ");
		c = leia.nextInt();
		
		if (a + b > c) {
		System.out.println("O numero digitado é maior do que C");
	 } else if (a + b < c) {
		 System.out.println("O numero digitado é menor que C");
	 } else if (a + b == c) {
		 System.out.println("O numero digitado é igual a C");
	 } 
		
		
		
		
	  leia.close();
	 	

	}

}
