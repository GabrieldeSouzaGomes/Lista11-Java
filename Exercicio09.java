//Calcule a média de 10 números  fornecidos pelo usuário

package lista11;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;

        System.out.println("Digite 10 números:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            double num = scanner.nextDouble();
            soma += num;
        }

        double media = soma / 10;
        System.out.println("A média dos números digitados é: " + media);

        scanner.close();
    }
}
