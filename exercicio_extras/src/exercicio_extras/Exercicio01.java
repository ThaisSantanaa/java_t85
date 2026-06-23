package exercicio_extras;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		var nome = leia.nextLine();
		
		System.out.println(nome);
		
		leia.close();

	}

}
