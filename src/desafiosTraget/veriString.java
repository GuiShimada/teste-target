package desafiosTraget;
import java.util.Scanner;

public class veriString {

	public static void main(String[] args) {
		System.out.println("Escreva uma frase: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		
		int quantidade = 0;
		char letraMinuscula = 'a', letraMainuscula = 'A';
		
		if(input.indexOf("a") > -1 || input.indexOf("A") > -1) {
			
			for(int cont = 0; cont < input.length(); cont++) {
				if(input.charAt(cont) == letraMinuscula 
						|| input.charAt(cont) == letraMainuscula) {
					quantidade++;
				}
			}
			System.out.println("Na String tem "+ quantidade +" letra(s) 'a'");
			
		}
		else {
			System.out.println("Não tem letra 'a'");
			
		}
		
		scanner.close();
	}

}
