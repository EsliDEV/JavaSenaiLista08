package AtividadeLista8DoWhile;

import intro.Number;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int limite, number, mult3, mult5, cont;
        System.out.println("Digite o valor limite: ");
        limite = input.nextInt();
        cont = 0;
        do {
            cont++;
            System.out.println("Digite um numero: ");
            number = input.nextInt();
            if (number % 3 == 0) {
                mult3 = number;
                System.out.println("O " + mult3 + " é multiplo de 3");
            } else if (number % 5 == 0) {
                mult5 = number;
                System.out.println("O " + mult5 + " é multiplo de 5");
            } else {
                System.out.println("O " + number + " não é multiplo nem de 3, nem de 5 ");
            }
        }while (limite != cont) ;

        }

    }
