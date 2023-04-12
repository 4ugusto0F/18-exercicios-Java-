package Montanha;

import java.util.Scanner;

public class Area_Quad {
    // inicio do programa
    public static void main(String[] args) {

        //dados variaveis
        int altura, base;
        float area;

        Scanner input = new Scanner(System.in);
        System.out.print("\n Qual é a altura do quadrado? ");
        altura = input.nextInt();
        System.out.print("\n Qual é a base do quadrado? ");
        base = input.nextInt();
        
        //Calculo
        area = 2 * (altura * base);

        //Saida de dados
        System.out.printf("\n O dobro do valor da area do Quadrado é %.2f \n \n", area);
        input.close();
    }
    
}
