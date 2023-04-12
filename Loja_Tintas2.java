package Montanha;

import java.util.Scanner;

public class Loja_Tintas2 {
    public static void main(String[] args) {
        
        float litrosLata = 18.00f;
        float litrosGalao = 3.6f;
        float valorLata = 80.0f; 
        float valorGalao = 25.0f; 
        
        Scanner input = new Scanner(System.in);
        System.out.print("\nQuantos metros quadrados o senhor(a) ira pintar ? ");
        float metrosQ = input.nextFloat();
        System.out.print("\nDeseja comprar em latas de:\n [1]18L  [2]3,6L  [3]Ambas \nDigite o numero no qual corresponde a sua escolha:");
        short escolha = input.nextShort();
        input.close();

        float litrosMq = (metrosQ / 6);

        if (escolha==1) {
            float qLata = (float) Math.ceil(litrosMq / litrosLata);
            float valorFinalL = (float) (qLata * valorLata);
            System.out.printf("\nPara essa metragem você ira precisar de %s Latas de tinta\n", qLata);
            System.out.printf("O valor total fica %s Reais.\n \n", valorFinalL);
        }
        else if (escolha==2) {
            float qGalao = (float) Math.ceil(litrosMq / litrosGalao);
            float valorFinalG = (float) Math.ceil(qGalao * valorGalao);
            System.out.printf("\nPara essa metragem você ira precisar de %s Galões de tinta \n", qGalao);
            System.out.printf("O valor total fica %s Reais.\n \n", valorFinalG);
        }
        else {
            if (escolha==3) {
                float litrosMqA = (float) (litrosMq * 0.1);
                    
                //Lata e Galao com 10% para seguro
                float lataA = (int) Math.ceil(litrosMqA / litrosLata); 
    
                float qLataM = litrosMqA / lataA;
                float qLataM2 = (int) Math.floor(litrosMqA / lataA);
                float litrosResto = qLataM - qLataM2;
                float qGalaoM = (int) Math.ceil( litrosResto / litrosGalao);
    
                float valorFinalM = (qLataM2 * valorLata) + (qGalaoM * valorGalao);

                System.out.printf("\nPara essa metragem você ira precisar de %s Latas de 18L e %s Galões de 3,6\n", qLataM2, qGalaoM );
                System.out.printf("O valor total fica %s Reais.\n \n",valorFinalM );
                    
            }
            else {
                System.out.println("\n[ERRO]----[Escolha uma opção valida, EX: [1]-[2]-[3] obrigado pela compreensão] \n \n");
            }  
        }
    }
}