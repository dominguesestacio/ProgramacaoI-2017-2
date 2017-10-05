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
        double qtdatual, qtdmin, qtdmax, qtdmedia;

        System.out.println("Informe a quantidade atual no estooque ;");
        double qtdatual = ent.nextDouble();
        System.out.println("Informe a quantidade mínima e a quantidade máxima :");
        double (qtdmin, qtdmax)= ent.nextDouble();
   
    (qtdmedia <- (qtdmin + qtdmax / 2))
         if (qtdatual >= qtdmedia) {
            
        }
        System.out.println("Não efetuar compra !");
        else
            System.out.println("Efetuar Compra");

    }

}
