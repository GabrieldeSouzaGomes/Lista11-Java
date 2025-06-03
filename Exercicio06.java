//Imprima os primeiros 10 números de sequencia de Fibonacci
package lista11;

public class Exercicio06 {

    public static void main(String[] args) {
        int n = 10; // quantidade de termos
        int primeiro = 1;
        int segundo = 1;

        System.out.println("Sequência de Fibonacci (10 primeiros termos):");
        System.out.print(primeiro + " " + segundo + " ");

        for (int i = 3; i <= n; i++) {
            int proximo = primeiro + segundo;
            System.out.print(proximo + " ");
            primeiro = segundo;
            segundo = proximo;
        }
    }
}
