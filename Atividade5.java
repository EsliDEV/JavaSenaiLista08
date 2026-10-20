package AtividadeLista8DoWhile;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, d;
        String nextt = "";
        do {
            System.out.println("Digite um numero: ");
            n = sc.nextInt();
            System.out.println("Digite outro numero: ");
            d = sc.nextInt();
            if(n % d == 0){
                System.out.println(n +" é divisivel " + d );
            }else{
                System.out.println(n + "nao é divisivel " + d);
            }

            System.out.println("Quer continuar? [s] sim [n] nao");
            nextt = sc.next();
            }while(nextt.equals("s"));
            System.out.println("sistema encerrado.");

    }
}
