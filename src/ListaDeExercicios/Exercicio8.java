/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDeExercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author André
 */
public class Exercicio8 {

    public static void main(String args[]) {
        int condicao = 0;
        Double num1, num2, total; // usei o double caso a nota for quebrada
        num1 = Double.parseDouble(JOptionPane
                .showInputDialog("Digite a primeira nota: "));
        num2 = Double.parseDouble(JOptionPane
                .showInputDialog("Digite a segunda nota: "));

        total = ((num1 + num2) / 2);
           if (total > 6) //aqui vc faz a verificao para saber se o aluno será aprovado ou não
        {
            condicao = 1;
        } else {
            condicao = 2;
        }
        switch (condicao) {
            case 1:
                System.out.println("Aluno Aprovado");
                break;
            case 2:
                System.out.println("Aluno Reprovado");
                break;
        }
    }
}
