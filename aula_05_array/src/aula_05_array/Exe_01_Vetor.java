package aula_05_array;

import java.util.Arrays;
import java.util.Scanner;


public class Exe_01_Vetor {

	public static void main(String[] args) {
		
		int vetorInteiros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 9 };
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o numero que você deseja encontrar: ");
		int numeroProcurado = leia.nextInt();
		
		int posicao = -1;
		
		for (int i = 0; i < vetorInteiros.length; i ++) {
			if (vetorInteiros[i] == numeroProcurado) {
				posicao = i; 
				break;
			}
		}
			
		if (posicao != -1){
			System.out.println("O número" + numeroProcurado + " está localizado na posição " + posicao);
		}else{
			System.out.println("O número" + numeroProcurado + " Não foi encontrado!");
		}
		
		
		
		{

			
		}
		
		
		
		leia.close();
		
		
		
	
		
		
		
	
		

	}

}
