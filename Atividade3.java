package AtividadeLista8DoWhile;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, contadorDeMultiplo, multiplo, cont;
        cont = 0;
        contadorDeMultiplo = 0;
        multiplo = 0;

        do{
            cont++;
            System.out.println("Digite um numero: ");
            number = input.nextInt();
            if(number % 4 == 0){
                contadorDeMultiplo++;
                System.out.println(contadorDeMultiplo + " digito digitado é multiplos de 4");
                System.out.println("O numero " + number + " é multiplo de 4");
            } else {
                multiplo++;
                System.out.println(multiplo + " digito digitado não é multiplos de 4");
                System.out.println("O " + number + " não é multiplo");
            }
        }while(cont != 15);
    }
}

