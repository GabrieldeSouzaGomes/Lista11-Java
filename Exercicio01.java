//Calcule a soma dos números de 1 a 100

package lista11;

public class Exercicio01 {
    public static void main(String[] args) {

        System.out.println("Calcule a soma dos números de 1 a 100");

        int acumuladora = 0;

        for (int numero = 1; numero <= 100; numero++) {
            acumuladora = acumuladora + numero;
        }

        System.out.println("A soma dos números de 1 a 100 é: " + acumuladora);
    }
}
