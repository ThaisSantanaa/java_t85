package atividades_pratica;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		float valorNotaDoAluno;
		
		
		System.out.println("Digite o nome do aluno(a): ");
		nome = leia.nextLine();
	    
		System.out.println("Digite a nota do aluno: ");
		valorNotaDoAluno = leia.nextFloat();
		
		
		System.out.println("**************RESULTADO*****************");
		System.out.println("       Aluno(a): " + nome                   );
		System.out.println("****************************************");
	    System.out.println("       nota: " + valorNotaDoAluno        );
		System.out.println("****************************************");
		
		
		if (valorNotaDoAluno >= 7) {
      } else if (valorNotaDoAluno >= 5) {
		    System.out.println(    "Situação: Recuperação"           );
	  } else {
	        System.out.println("Situação: Reprovado(a)");
	       
		}
		
	
		leia.close();
		
		
	}

}
