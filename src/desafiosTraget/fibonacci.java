package desafiosTraget;
import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		int n1 = 0, n2 = 1, cont, soma, input;
		
		System.out.println("Digite um numero entre 0 à 1000: ");
		
		while(true) {
			Scanner scanner = new Scanner(System.in);
			input = scanner.nextInt();
			
			if(input >= 0 && input <= 1000) {
				scanner.close();
				break;
			}
			
			System.out.println("O numero precisa ser entre 0 à 1000: ");
			
		}
		
	    
	    for(cont = 0; cont < 20 ; cont ++) {
	    	soma = n1 + n2;
	    	n1 = soma;
	    	n2 = n1 + n2;

	    	if(input == n1 || input == n2) {
	    		System.out.println("O valor digitado pertence a sequencia de fibonacci!");
	    		break;
	    	}
	    	
	    	if(n1 > input) {
	    		System.out.println("O valor digitado não pertence a sequencia de fibonacci!");
	    		break;
	    	}
	    }
	}

}
