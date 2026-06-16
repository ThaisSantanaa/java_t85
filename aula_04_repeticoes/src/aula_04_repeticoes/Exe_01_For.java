package aula_04_repeticoes;

import java.util.Scanner;

public class Exe_01_For {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2;
		
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextInt();
		
		if (numero1 > numero2 || numero1 < 0 || numero2 <0  ) {
			System.out.println("O intervalo é invalido!");
		} else {
			
			System.out.println("Intervalo entre " + numero1 + " e " + numero2 + ":");

            for (int contador = numero1; contador <= numero2; contador++) {

                if (contador % 3 == 0 && contador % 5 == 0) {
                    System.out.println(contador + " é múltiplo de 3 e 5");
		}
            }
		}
	    	
	    	leia.close();
	    	
	}
}
		
