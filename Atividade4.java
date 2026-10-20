package AtividadeLista8DoWhile;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, impar, par, cont, contImpar, contPar;
        cont = 0;
        contImpar = 0;
        contPar = 0;
        do {
            cont++;
            System.out.println("Digite um numero: ");
            number = sc.nextInt();
            if (number % 2 == 0) {
                System.out.println("O " + number + " é par");
                contPar++;
            } else {
                System.out.println("O " + number + " é impar");
                contImpar++;
            }
        } while (cont != 12);
        System.out.println(contImpar + " digitos são impares.");
        System.out.println(contPar + " digitos são pares");
    }
}
