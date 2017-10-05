/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDeExercicios;

/**
 *
 * @author André
 */
public class Exercicio9 {
    public static void main(String[] args) {
        int c = 1;
        c = 0;
        System.out.println(c--);// c=0 -0 é igual a 0
        System.out.println(++c);// c=0 +0 é igual a 0
        System.out.println(c);  // c=0 imprime      0
        c -= --c - c++;                          // 0
        System.out.println(c--);// c=0 -0 é igual a 0
        System.out.println(++c);// c=0 +0 é igual a 0
        System.out.println(c);  // c=o e imprime    o
    }
    
}
