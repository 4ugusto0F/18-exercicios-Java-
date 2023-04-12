package Montanha;

import java.util.Scanner;

public class Base_Calculo {
    
    //inicio do programa
    public static void main(String[] args) {

        //dados variaveis
        int numero1, numero2;
        float numero3;
        float cal_1, cal_2, cal_3;

        Scanner input = new Scanner(System.in);
        System.out.print("\n Digite o primeiro numero: ");
        numero1 = input.nextInt();
        System.out.print("\n Digite o segundo numero: ");
        numero2 = input.nextInt();
        System.out.print("\n Digite o terceiro numero: ");
        numero3 = input.nextFloat();

        cal_1 = (numero1 * 2) + (numero2 / 2);
        cal_2 = (numero1 * 3) + numero3;
        cal_3 = (float) Math.pow(numero3, 3);

        System.out.printf("\nO valor do primeiro calculo foi = %.1f", cal_1);
        System.out.printf("\nO valor do segundo calculo foi = %.1f", cal_2);
        System.out.printf("\nO valor do terceiro calculo foi = %.1f \n \n", cal_3);
        input.close();
    }
}
