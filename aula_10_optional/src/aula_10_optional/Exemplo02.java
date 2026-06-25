package aula_10_optional;

import java.util.Optional;

public class Exemplo02 {

	public static void main(String[] args) {
		
		String frases[] =new String[5];
		
		frases[2] = "Gerenation Brasil";
		
		for(var frase : frases) {
			System.out.println(frase);
			
		}
		
		//Optional Vazio 
		Optional<String>optionalVazio = Optional.empty();
	    System.out.println("Exibir o valor de optionVazio " + optionalVazio);
	    System.out.println("O optionVazio está vazio? " + optionalVazio.isEmpty());
	    
	    //Optional com dados
	    Optional<String>valorIndice2 = Optional.of(frases[2]);
	    System.out.println("\nExibir o valor de valorIndice2: " + valorIndice2);
	    System.out.println("\nO valorIndice2 tem alguma coisa? " + valorIndice2.isPresent());
	    System.out.println("\nQual é o valor armazenado em valorIndice2: " + valorIndice2.get());
		
	}

}
