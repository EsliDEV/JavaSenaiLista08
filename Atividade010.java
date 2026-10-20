import java.util.Scanner;
public class Atividade010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor em centavos: ");
        int valor = sc.nextInt();
        while (valor < 0) {
            System.out.println("Valor invalido!");
            System.out.print("Digite o valor em centavos: ");
            valor = sc.nextInt();
        }
        int moedas25 = 0;
        int moedas10 = 0;
        int moedas5 = 0;
        int moedas1 = 0;
        while (valor > 0) {
            if (valor >= 25) {
                moedas25 = valor / 25;
                valor = valor % 25;
            } else if (valor >= 10) {
                moedas10 = valor / 10;
                valor = valor % 10;
            } else if (valor >= 5) {
                moedas5 = valor / 5;
                valor = valor % 5;
            } else {
                moedas1 = valor;
                valor = 0;
            }
        }
        System.out.println("Moedas de 25 centavos: " + moedas25);
        System.out.println("Moedas de 10 centavos: " + moedas10);
        System.out.println("Moedas de 5 centavos: " + moedas5);
        System.out.println("Moedas de 1 centavo: " + moedas1);
        sc.close();
    }
}