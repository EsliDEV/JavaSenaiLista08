import java.util.Scanner;
public class Atividade09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int segredo = 42;
        System.out.print("Digite seu palpite: ");
        int palpite = sc.nextInt();
        while (palpite != segredo) {
            if (palpite > segredo) {
                System.out.println("Seu palpite e maior que o numero secreto");
            } else {
                System.out.println("Seu palpite e menor que o numero secreto");
            }
            if (palpite % 2 == 0) {
                System.out.println("Seu palpite e par");
            } else {
                System.out.println("Seu palpite e impar");
            }
            System.out.print("Digite seu palpite: ");
            palpite = sc.nextInt();
        }
        System.out.println("Parabens, voce acertou! O numero era " + segredo);
        sc.close();
    }
}
