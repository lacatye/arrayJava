package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for ( int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		
		System.out.print("Números pares: ");
		
		int nPares = 0;
		for (int i=0; i<n; i++) {
			if (vect[i] % 2 == 0) {
				System.out.printf("%d  ", vect[i]);
				nPares++;	
				}
		}
		
		System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", nPares);
		
		
		sc.close();

	}

}
