import java.util.Scanner;

public class Exercicio1_1 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);

        int A,B, soma;

        A = sc.nextInt();
        B = sc.nextInt();

        soma = A + B;

        System.out.println("soma = " + soma);

        sc.close();
    }

}