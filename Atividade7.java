package AtividadeLista8DoWhile;

import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont, mult3, mult5, soma;
        cont = 0;
        soma = 0;
        do {
            cont++;
            if(cont % 3 == 0){
                System.out.println(cont + "É multiplo de 3");
                soma +=  +cont;
                System.out.println("A soma dos numeros são: " +soma);
            } else if (cont % 5 == 0) {
                System.out.println(cont + " É multpliplo de 5");
                System.out.println("A soma dos numeros são: " +soma);
            }else{
                System.out.println(cont +  " Não é multiplico");
                soma +=  +cont;
            }

        }while (cont != 100);

    }
}
