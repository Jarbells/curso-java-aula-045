import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
	
			int n, evenQuantity; 
			int[] vect;
			
			System.out.print("Quantos numeros voce vai digitar? ");
			n = sc.nextInt();			
			vect = new int[n];
					
			for(int i = 0; i < vect.length; i++) {
				System.out.printf("Digite um numero: ");
				vect[i] = sc.nextInt();
			}
			
			System.out.println("\nNUMEROS PARES:");
			evenQuantity = 0;
			for(int i = 0; i < vect.length; i++) {
				if(vect[i] % 2 == 0) {
					System.out.printf("%d ", vect[i]);
					evenQuantity++;
				}			
			}
			
			System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", evenQuantity);
			
			sc.close();
			}
		}
	}
