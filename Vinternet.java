package Montanha;

import java.util.Scanner;

public class Vinternet {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("\nDigite o tamanho do arquivo para download em MB:");
        float tArquivo = input.nextFloat();
        System.out.print("\nDigite qual a velocidade da internet em Mbps:");
        float Vinternet = input.nextFloat();
        input.close();

        float dowPS = (tArquivo * 8) / Vinternet;
        float dowPM = dowPS / 60;

        System.out.printf("\nO se dowbload sera concluido em %.2f Minutos.\n \n", dowPM);
    }
}