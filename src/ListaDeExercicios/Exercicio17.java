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
public class Exercicio17 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num;
        String bin;

        System.out.println("Informe Um Nomero a Ser Convertido :");
        num = (int) ent.nextInt();

        bin = Integer.toString(num, 2);
        //  O Comando integer.toStrind pega o Numero e Transforma na base Binaria
        System.out.println("O Numero " + num + " Em Binario é " + bin);

    }
}
