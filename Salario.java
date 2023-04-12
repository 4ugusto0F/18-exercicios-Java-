package Montanha;

import java.util.Scanner;

public class Salario {

 public static void main(String[] args) {
    
        Double valorHora, horasTrabalhadas, salarioB, inss, ir, sindicato, salarioL;
 
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nQuanto você ganha por hora? ");
        valorHora = teclado.nextDouble();
        System.out.print("\nQuantas horas você trabalha por més ? ");
        horasTrabalhadas = teclado.nextDouble();
 
        salarioB = valorHora * horasTrabalhadas;
        ir = salarioB * 0.11;
        inss = salarioB * 0.08;
        sindicato = salarioB * 0.05;
        salarioL = salarioB - inss - ir - sindicato;

        System.out.printf("\nO valor bruto do seu salario é: %.2f Reais\n", salarioB);
        System.out.printf("O valor do imposto IR é: %.2f Reais\n", ir);
        System.out.printf("O valor do imposto INSS é: %.2f Reais\n", inss);
        System.out.printf("O valor do imposto Sindicato é: %.2f Reais\n", sindicato);
        System.out.printf("O valor liquido do seu salario é: %.2f Reais \n \n",salarioL);
        teclado.close();
    }   
}