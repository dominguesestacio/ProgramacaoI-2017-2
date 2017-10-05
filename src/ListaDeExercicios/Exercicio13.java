/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDeExercicios;

import java.util.Scanner;

/**
 *
 * @author André
 */
public class Exercicio13 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        double macas = 0.30;
        int quantMacas = 0;
        double multiplicacao;

        System.out.print("Digite a quantidade de macas: ");
        quantMacas = input.nextInt();

        if (quantMacas < 12) 
            { multiplicacao = quantMacas * macas; }
        else
            { multiplicacao = quantMacas * 0.25; }

        System.out.print("o valor a ser pago é: R$ " + multiplicacao);
        System.out.println();
    }
}

