//Calcule o fatorial de um de um numero fornecido pelo usuário

package lista11;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro não negativo para calcular o fatorial: ");
        int num = scanner.nextInt();
        
        if (num < 0) {
            System.out.println("Número inválido! O fatorial só é definido para números não negativos.");
        } else {
            long fatorial = 1;
            for (int i = 1; i <= num; i++) {
                fatorial *= i;
            }
            System.out.println("O fatorial de " + num + " é: " + fatorial);
        }
        
        scanner.close();
    }
}
