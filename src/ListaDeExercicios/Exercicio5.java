/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDeExercicios;

/**
 *
 * @author aluno
 */
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 3;
        int b = 1;
        int c = b + 1;
        int d = c > ++b ? (a - 3) : b; //d=1
        // 'd' igual a 'c'2 se 'c'for maior do que 'b'2 = falso ele nao executa
        // a-3 so atribui o valor de 'b'1
        int e = 4;
        if (d > a && b + 1 < a || b > 1) {
            c += 7;
        }
        // 'd'1 é maior que 'a'3 = falso e nao executa a segunda parte
        // atribui e=4
        if (-7 >= -c) {
            a -= 4;
        } // -7 é maior ou igual '-c'-2
        else {
            d *= 2;
        }

        e = ++d % 3;
        // 'e' é igual '++d'2

        b = d++ % 3;

        System.out.println("valor de a: " + a);
        System.out.println("valor de b: " + b);
        System.out.println("valor de c: " + c);
        System.out.println("valor de d: " + d);
        System.out.println("valor de e: " + e);

    }

}
//         RESPOSTA
//        
//        a= -1
//        b= 0
//        c= 9
//        d= 4
//        e= 0
