package atividades_pratica;

import java.util.Scanner;

public class Exe06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		

        String nome, cargo = "";
        int codigoCargo;
        double salario, reajuste = 0.0, novoSalario;

        System.out.print("Nome do colaborador: ");
        nome = leia.nextLine();

        System.out.print("Cargo (código 1 a 6): ");
        codigoCargo = leia.nextInt();

        System.out.print("Salário: R$ ");
        salario = leia.nextDouble();

        switch (codigoCargo) {
            case 1:
                cargo = "Gerente";
                reajuste = 0.10;
                break;

            case 2:
                cargo = "Vendedor";
                reajuste = 0.07;
                break;

            case 3:
                cargo = "Supervisor";
                reajuste = 0.09;
                break;

            case 4:
                cargo = "Motorista";
                reajuste = 0.06;
                break;

            case 5:
                cargo = "Estoquista";
                reajuste = 0.05;
                break;

            case 6:
                cargo = "Técnico de TI";
                reajuste = 0.08;
                break;

            default:
                System.out.println("Código de cargo inválido!");
                return;
        }

        novoSalario = salario + (salario * reajuste);

        System.out.println("\nNome do colaborador: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.printf("Salário: R$ %.2f%n", novoSalario);

        leia.close();
    }
}

	


