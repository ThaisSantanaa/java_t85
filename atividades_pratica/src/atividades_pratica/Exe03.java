package atividades_pratica;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double numero1, numero2, resultado;
        int operacao;
		
		System.out.println("----->calculator<-----");
		
		System.out.println("Digite o Primeiro Número: ");
		numero1 = leia.nextDouble();
		
		System.out.println("Digite o segundo Número: ");
	    numero2= leia.nextDouble();
	    
	    System.out.println("****************************************");
		System.out.println("****Escolha uma operacao aritmetica*****");
		System.out.println("****************************************");
		System.out.println("      1 -        Soma                   ");
		System.out.println("      2 -      Subtração                ");
		System.out.println("      3 -     Multiplicação             ");
		System.out.println("      4 -       Divisão                 ");
		System.out.println("****************************************");
		System.out.println("****************************************");
		
		System.out.println("Escolha uma operacao: ");
	    operacao = leia.nextInt();
		
	   switch (operacao) {
		
	  case 1:
		
		 resultado = numero1 + numero2;
         System.out.printf("Operação: Soma\nResultado: %.2f", resultado);
         break;
         
	  case 2:
          resultado = numero1 - numero2;
          System.out.printf("Operação: Subtração\nResultado: %.2f", resultado);
          break;
          
	  case 3:
          resultado = numero1 * numero2;
          System.out.printf("Operação: Multiplicação\nResultado: %.2f", resultado);
          break;

      case 4:
          if (numero2 != 0) {
              resultado = numero1 / numero2;
              System.out.printf("Operação: Divisão\nResultado: %.2f", resultado);
          } else {
              System.out.println("Erro: divisão por zero.");
          }
          break;

      default:
          System.out.println("Erro: código de operação inválido.");
  }

         
		leia.close();
		

	}

}
