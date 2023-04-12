package Montanha;

import java.util.Scanner;

public class Conversor_Cel_Far {
    
    //inicio do programa
    public static void main(String[] args) {
            
        //Dados variaveis
        Double celsius;
        Double fahrenheit;

        //Incerção de dados
        Scanner input = new Scanner(System.in);
        System.out.print("\nConverta Fahrenheit em Celsius aqui: ");
        celsius = input.nextDouble();

        //Converção
        fahrenheit = (celsius * 1.8) + 32;

        //Saida de dados
        System.out.printf("\nA temperatura em Celsius é: %.0f \n \n", fahrenheit);
        input.close();
        
    }
}