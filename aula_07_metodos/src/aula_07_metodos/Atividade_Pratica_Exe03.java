package aula_07_metodos;
import java.util.ArrayList;
import java.util.Scanner;

public class Atividade_Pratica_Exe03 {

    public static void main(String[] args) {

        ArrayList<String> produtos = new ArrayList<>();
        ArrayList<Integer> quantidades = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1 - Adicionar produto");
            System.out.println("2 - Atualizar produto");
            System.out.println("3 - Listar estoque");
            System.out.println("4 - Sair");

            int opcao = Integer.parseInt(sc.nextLine().trim());

            if (opcao == 1) {

                System.out.print("Nome do produto: ");
                produtos.add(sc.nextLine());

                System.out.print("Quantidade: ");
                quantidades.add(Integer.parseInt(sc.nextLine().trim()));

                System.out.println("Produto adicionado!");

            } 
            else if (opcao == 2) {

                System.out.print("Nome do produto: ");
                String nome = sc.nextLine();

                boolean achou = false;

                for (int i = 0; i < produtos.size(); i++) {
                    if (produtos.get(i).equalsIgnoreCase(nome)) {

                        System.out.print("Nova quantidade: ");
                        quantidades.set(i, Integer.parseInt(sc.nextLine().trim()));

                        System.out.println("Atualizado!");
                        achou = true;
                    }
                }

                if (!achou) {
                    System.out.println("Produto não encontrado!");
                }

            } 
            else if (opcao == 3) {

                System.out.println("\n--- ESTOQUE ---");

                for (int i = 0; i < produtos.size(); i++) {
                    System.out.println("Produto: " + produtos.get(i) +
                            " | Quantidade: " + quantidades.get(i));
                }

            } 
            else if (opcao == 4) {
                break;
            }
        }
    }
}