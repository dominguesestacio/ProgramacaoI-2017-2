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
public class Exercicio14 {

    static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        double extra = 0, salariofinal = 0, salarioinicial = 0, horasextra = 0, salarioexta = 0;

        System.out.println("Entre com o total de horas que você trabalhou: ");
        double horas = ent.nextDouble();
        System.out.println("Entre com o salário/hora: ");
        double salariohora = ent.nextDouble();
        salarioinicial = 40 * salariohora;
        if (horas == 40) {
            System.out.println("Seu salário é: " + salarioinicial);
        }
        if (horas > 40) {
            horasextra = horas - 40;
            extra = (salariohora * 50) / 100;
            salarioexta = horasextra * extra;
            salariofinal = salarioinicial + salarioexta;

            System.out.println("Seu salário é: " + salariofinal);
        }
    }

}
