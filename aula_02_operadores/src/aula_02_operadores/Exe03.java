package aula_02_operadores;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o Salario Bruto: ");
		float valorSalarioBruto = leia.nextFloat();
		
		System.out.println("Digite o Adicional Noturno: ");
		float valorAdicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite Suas Horas Extras: ");
		float valorHorasExtras = leia.nextFloat();
		
		System.out.println("Digite Seus Descontos Salarial: ");
		float valorDescontoSalarial = leia.nextFloat();
		
		float salarioliquido = valorSalarioBruto + valorAdicionalNoturno + (valorHorasExtras * 5) - valorDescontoSalarial;
		
		System.out.printf("\nSalario liquido: %.2f", salarioliquido );
		
		
		leia.close();
		
		
	
	}

}
