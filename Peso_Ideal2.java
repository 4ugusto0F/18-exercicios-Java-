package Montanha;

import java.util.Scanner;

public class Peso_Ideal2 {

    //Inicio do programa
    public static void main(String[] args) {
        
        //Dados variaveis
        float altura;
        String sexo;
        String H = "H" ;
        Double peso_id;

        //Inserção de dados
        Scanner input = new Scanner(System.in);
        System.out.print("\nVocê e biologicamente Homen ou Mulher? Digite (H) para Homen ou (M) Para mulher :");
        sexo = input.nextLine();
        //TEM QUE SER LETRA MAIUSCULA!
        System.out.print("\n Qual a sua altura? ");
        altura = input.nextFloat();

        //Calculo 
        peso_id = (H.equals(sexo))? (float) (altura * 72.7) - 58: (float) (altura * 62.1) - 44.7;

        //Saída de dados
        System.out.printf("\n O seu peso ideal é %.2f \n \n", peso_id);
        input.close();
    }
}