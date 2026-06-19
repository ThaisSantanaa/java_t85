package aula_07_metodos;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade_Pratica_Exe_02 {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Integer> idades = new ArrayList<>();
        ArrayList<Double> notas = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1 - Adicionar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Média das notas");
            System.out.println("4 - Sair");

            int opcao = Integer.parseInt(sc.nextLine().trim());

            if (opcao == 1) {

                System.out.print("Nome: ");
                nomes.add(sc.nextLine());

                System.out.print("Idade: ");
                idades.add(Integer.parseInt(sc.nextLine().trim()));

                System.out.print("Nota: ");
                notas.add(Double.parseDouble(sc.nextLine().trim()));

                System.out.println("Aluno adicionado!");

            } 
            else if (opcao == 2) {

                System.out.println("\n--- ALUNOS ---");

                for (int i = 0; i < nomes.size(); i++) {
                    System.out.println("Nome: " + nomes.get(i) +
                            " | Idade: " + idades.get(i) +
                            " | Nota: " + notas.get(i));
                }

            } 
            else if (opcao == 3) {

                double soma = 0;

                for (int i = 0; i < notas.size(); i++) {
                    soma += notas.get(i);
                }

                if (notas.size() > 0) {
                    System.out.println("Média: " + soma / notas.size());
                } else {
                    System.out.println("Nenhum aluno cadastrado.");
                }

            } 
            else if (opcao == 4) {
                break;
            }
        }
    }
}