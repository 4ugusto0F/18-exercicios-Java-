package Montanha;

import java.util.Scanner;

public class Conversor_Met_Cem {
 //Inicio do programa
 public static void main(String[] args) {

    //Dados variaveis
    double metros;
    double centimetros;

    //Incerção de dados
    Scanner input = new Scanner(System.in);
    System.out.print("\nInsira metros para converter em centimetros aqui: ");
    metros = input.nextDouble();

    //converção-calculo
    centimetros = metros * 100;

    //Saida de dados
    System.out.println("\no numero em centimetros e = " + centimetros );
    input.close();
    }
}
