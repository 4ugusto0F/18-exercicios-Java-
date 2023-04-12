package Montanha;

import java.util.Scanner;

public class Conversor_Far_Cel {

    //inicio do programa
    public static void main(String[] args) {
        
        //Dados variaveis
        Double celsius;
        Double fahrenheit;

        //Incerção de dados
        Scanner input = new Scanner(System.in);
        System.out.print("\nConverta Fahrenheit em Celsius aqui: ");
        fahrenheit = input.nextDouble();

        //Converção
        celsius = (fahrenheit - 32) / 1.8;

        //Saida de dados
        System.out.printf("\nA temperatura em Celsius é: %.0f \n \n", celsius);
        input.close();
    }
}