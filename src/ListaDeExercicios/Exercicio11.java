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
public class Exercicio11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.println("Digite um numero: ");
        num = entrada.nextInt();
        if (num < 10) {
            System.out.println("numero Menor do que 10");
        } else if (num == 10) {
            System.out.println("Numero Igual a 10");
        }

    }

}
