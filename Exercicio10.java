//Conte e imprima quantos números primos existem entre 1 a 100

package lista11;

public class Exercicio10 {

    public static void main(String[] args) {
        int contadorPrimos = 0;

        for (int num = 2; num <= 100; num++) {
            if (ehPrimo(num)) {
                contadorPrimos++;
            }
        }

        System.out.println("Quantidade de números primos entre 1 e 100: " + contadorPrimos);
    }

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
