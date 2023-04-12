package Montanha;

import java.util.Scanner;

public class Loja_Tintas {

    public static void main(String[] args) {

        Float metrosQ;
        
        int Qlata;
        int valorFinal; 
        int valorlata = 80;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nQuantos metros quadrados o senhor(a) ira pintar ? ");
        metrosQ = teclado.nextFloat();

        float litros = (metrosQ / 3);
        float lataMq = 18;
        Qlata = (int) Math.ceil((float)litros / lataMq);
        
        valorFinal = valorlata * Qlata;

        System.out.println("\nPara essa metragem você ira precisar de " + Qlata + " Latas de tinta.");
        System.out.println("O valor total fica " + valorFinal + " Reais.\n");
        teclado.close();
    }
}
