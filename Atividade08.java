import java.util.Scanner;
public class Atividade08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 1;
        while (contador <= 10) {
            System.out.print("Digite o numero " + contador + ": ");
            int numero = sc.nextInt();
            int ultimo = numero % 10;
            if (ultimo < 0) {
                ultimo = ultimo * -1;
            }
            if (ultimo == 0) {
                System.out.println(numero + " termina em 0");
            } else if (ultimo == 5) {
                System.out.println(numero + " termina em 5");
            } else {
                System.out.println(numero + " termina em outro valor (" + ultimo + ")");
            }
            contador = contador + 1;
        }
        sc.close();
    }
}
 