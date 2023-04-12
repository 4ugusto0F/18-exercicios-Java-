package Montanha;

import java.util.Scanner;

public class Bimestre {
    //Inicio do programa
    public static void main(String[] args) {
    
        //Dados variaveis
        Float bimestre1;
        Float bimestre2;
        Float bimestre3;
        Float bimestre4;
        Float bimestretotal;
        Float media;

        //Incerção de dados
        Scanner input = new Scanner(System.in);
        System.out.print("\nColoque a nota do primeiro bimestre aqui:");
        bimestre1 = input.nextFloat();
        System.out.print("\nColoque a nota do segundo bimestre aqui:");
        bimestre2 = input.nextFloat();
        System.out.print("\nColoque a nota do terceiro bimestre aqui:");
        bimestre3 = input.nextFloat();
        System.out.print("\nColoque a nota do quarto bimestre aqui:");
        bimestre4 = input.nextFloat();

        //Calculos
        bimestretotal = bimestre1 + bimestre2 + bimestre3 + bimestre4;

        media = ( bimestre1 + bimestre2 + bimestre3 + bimestre4 ) / 4;

        //Saida de dados
        System.out.println("\nO valor total do seu ano letivo foi: " + bimestretotal );
        System.out.println("\nA media do seu ano letivo foi: " + media);
        input.close();
    
    }
}