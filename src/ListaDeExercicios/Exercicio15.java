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
public class Exercicio15 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int qtdatual;
        int qtdmin;
        int qtdmax;
        int qtdmed;

        System.out.println("Informe a quantidade atual no estoque :");
        qtdatual = (int) ent.nextInt();
        System.out.println("Informe a quantidade mínima do estoque:");
        qtdmin = (int) ent.nextInt();
        System.out.println("Informe a quantidade máxima do estoque:");
        qtdmax = (int) ent.nextInt();

        // ((quantidade média = quantidade máxima + quantidade mínima)/2).
        qtdmed = (qtdmax + qtdmin) / 2;
        
        // a quantidade media sera igual a qtdmax + qtdmin dividida por 2

        if (qtdmed >= qtdatual) {
            //se qtdmed for maior ou igual qtdatual nao efetue a compra
            
            System.out.println("Não efetuar compra !");
            // se nao efetue a compra
        } else {
            System.out.println("Efetuar Compra");
        }

    }

}
