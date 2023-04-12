package Montanha;

import java.util.Scanner;

public class Peso_Ideal1 {

    //Inicio do programa
    public static void main(String[] args) {
        
        //Dados variaveis
        float altura, peso_id;

        //Inserção de dados
        Scanner input = new Scanner(System.in);
        System.out.print("\n Qual a sua altura? ");
        altura = input.nextFloat();

        //Calculo
        peso_id = (float) (altura * 72.7) - 58;

        //Saída de dados
        System.out.printf("\n O seu peso ideal é %.2f \n \n", peso_id);
        input.close();
    }
}