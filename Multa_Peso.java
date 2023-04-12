package Montanha;

import java.util.Scanner;

public class Multa_Peso {

    public static void main(String[] args) {
    
        float peso, execessoP;
        double multa;

        Scanner input = new Scanner(System.in);
        System.out.print("\nQual o peso do peixe? ");
        peso = input.nextInt();
        input.close();
        if (peso>50) { 
            execessoP = peso - 50;
            multa = execessoP * 4.0;
            System.out.printf("\nVocê exedeu o peso limite em %.2f Kg e foi multado em %.2f Reais \n \n", execessoP, multa);
        } 
        else {
            System.out.println("\nParabens pela pesca não há multa a ser adicionada \n \n");
        } 
    }
}