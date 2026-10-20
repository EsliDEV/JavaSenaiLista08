package AtividadeLista8DoWhile;
import java.util.Scanner;
public class Atividade1 {
    public static void main(String[] args) {
        int number, impar, par, cont;
        Scanner sc = new Scanner(System.in);
        cont = 0;
        do {
            System.out.println("Digite um numero: ");
            number = sc.nextInt();
            cont++;
            if (number % 2 == 0) {
                par = number;
                System.out.println(par + " é par");
            } else {
                impar = number;
                System.out.println(impar + " é impar");
            }
        } while (cont != 20);


    }
}
