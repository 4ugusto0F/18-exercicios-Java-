package Montanha;

import java.util.Scanner;

public class Qual_numero {
    public static void main(String[] args) {

        int numero;

        Scanner input = new Scanner(System.in);
        System.out.println("Qual seu numero favorito?");
        numero = input.nextInt();

        System.out.println("O numero informado foi " + numero);
        input.close();
    }
}
