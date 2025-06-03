//Imprima os numeros pares de 1 a 50 
package lista11;

import java.util.Scanner;

public class Exercicio02 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculadora a soma dos números de 1 ate 100");
		
		int acumuladora = 0;
		for (int numero = 1; numero < 101; numero++) {
			
		
			acumuladora += numero;
			
			System.out.println(acumuladora);
			
			sc.close();
		}
		

	}

}

