package aula_07_metodos;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade_Pratica_Exe01 {

	   public static void main(String[] args) {
		   
		   Scanner leia = new Scanner(System.in);
		
	   Queue<Integer> fila = new LinkedList<>();
	   
	  int soma = 0;
	  int maior = Integer.MIN_VALUE;
	   
	  
	   for(int i = 1; i <= 5; i++) {
		  System.out.print("Digite um número: ");
          int numero = leia.nextInt();
          fila.add(numero);
          
          soma = soma + numero;
          
          if (numero > maior) {
              maior = numero;
          }
              
	   }
	   
	   double media = soma /5.0;
	   
	   System.out.println("\nA soma dos números é: " + soma);
	   
	   System.out.println("\nA media dos números é: " + media);
	   
	   System.out.println("\nO maior número é: " + maior);
	   
	   
	  leia.close();
	      

	}

}
