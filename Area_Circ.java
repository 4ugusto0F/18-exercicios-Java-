package Montanha;

import java.util.Scanner;

//Inicio do programa
public class Area_Circ {
    public static void main(String[] args) {
        
        //dados variaveis
        int raio;
        Double area;

        //Incerção de dados
        Scanner input = new Scanner(System.in);
        System.out.print("\n Qual o valor do raio do circulo? ");
        raio = input.nextInt();

        //Calculos
        area = Math.PI * Math.pow(raio, 2);

        //Saida de dados
        System.out.printf("\n O valor da area do circulo é %.2f \n \n", area);
        input.close();
    }
}