package Montanha;
import java.util.Scanner;

public class Somador {
    public static void main(String[] args) {
     
        int total;
        int numero1;
        int numero2;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite os numeros que você deseja somar");
        numero1 = input.nextInt();
        numero2 = input.nextInt();

        total = numero1 + numero2;

        System.out.println("A soma é = " + total);
        input.close();
    }
}
