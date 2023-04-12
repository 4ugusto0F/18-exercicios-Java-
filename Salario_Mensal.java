package Montanha;

import java.util.Scanner;

public class Salario_Mensal {

    //inicio do programa
    public static void main(String[] args) {
        
        //Dados variaveis
       double valorhora;
       double horastrabalhadas;
       double valortotal;

       //Incerção de dados
       Scanner input = new Scanner(System.in);
       System.out.print("\n Quanto você ganha por hora? ");
       valorhora = input.nextDouble();
       System.out.print("\n Quantas horas você trabalha por més ? ");
       horastrabalhadas = input.nextDouble();

       //Calculo
       valortotal = (valorhora * horastrabalhadas);

       //Saida de dados
       System.out.println("\no valor que você ganha por més é: " + valortotal);
       input.close();
    }
}