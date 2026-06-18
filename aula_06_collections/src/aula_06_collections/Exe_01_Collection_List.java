package aula_06_collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exe_01_Collection_List {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<String>();
		
		
		//AQUI ESTÁ LENDO AS CORES QUE O USUARIO DIGITA.
		 for (int i = 0; i < 5; i++) {
	            System.out.print("Digite uma cor: ");
	            String cor = leia.nextLine();
	            cores.add(cor);
	        }
		
		 //MOSTRA TODAS AS CORES CADASTRADAS.
		 System.out.println("\nCores cadastradas: " + cores);
		 
		 //AQUI ORDENA AS CORES.
		 Collections.sort(cores);
		 System.out.println("\nCores em ordem alfabetica: " + cores);
		 
		 
		leia.close();	

	}

}
